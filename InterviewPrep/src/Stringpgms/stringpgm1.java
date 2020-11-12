package Stringpgms;

import java.util.ArrayList;

public class stringpgm1 {

	public static String returnStringWithUniqueChar(String splitInput[]) {
		// ArrayList<String> uniquecharlist=new ArrayList<Character>();
		
		String finalString="";
		for (int i = 0; i < splitInput.length; i++) {
			ArrayList<Character> uniquecharlist = new ArrayList<Character>();
			char newsplitchar[] = splitInput[i].toCharArray();
			for (int j = 0; j < newsplitchar.length; j++) {
				if (!(uniquecharlist.contains(newsplitchar[j]))) {
					uniquecharlist.add(newsplitchar[j]);
				}
			}
			String newuniqueString = getStringRepresentation(uniquecharlist);
			finalString=finalString+newuniqueString;
			//System.out.print(newuniqueword);
		}

		return finalString;
	}

	static String getStringRepresentation(ArrayList<Character> list) {
		StringBuilder builder = new StringBuilder(list.size());
		for (Character ch : list) {
			builder.append(ch);
		}
		return builder.toString();
	}
	
	public static void returnFinalString(String input1,String input2)
	{
		char compareChar=input2.charAt(0);
		
		int start=input1.indexOf(compareChar);
		int end=input1.lastIndexOf(compareChar);
		for(int i=start+1;i<end;i++)
		{
			System.out.print(input1.charAt(i));
			
			
		}
		
	}

	public static void printArrayList(ArrayList<String> uniquelist) {
		for (String i : uniquelist) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "I love java programming";
		String input2="o";

		String splitInput[] = input1.split(" ");

		String unique = returnStringWithUniqueChar(splitInput);
		
		returnFinalString(unique,input2);

		

	}

}
