package Stringpgms;

import java.util.ArrayList;

public class replacewithoudmethodstring {
	
	public static ArrayList<String> replaceCharInString(String s[])
	{
		String newString="";
		ArrayList<String>resultarray=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			String tempstring=s[i];
			
			//Passing the string to a function that returns string with replaced characters
			newString=returnStringwithreplacechar(tempstring);
			
			resultarray.add(newString);
			
		}
		
		
		return resultarray;
}
	
	//Function to return a string with replaced characters
	public static String returnStringwithreplacechar(String s)
	{

		//String s="hello";
		//char temp;
		String newString="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='l'&&s.charAt(i+1)=='l')
			{
				newString=newString+"aa";
				i++;
			}
			else
				newString=newString+s.charAt(i);
		}

		return newString;
		
	}
	
	
	public static void printArraycontents(ArrayList<String>outputarray)
	{
		for(String i:outputarray)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"hello","ello"};
		
		ArrayList<String>outputarray=new ArrayList<String>();
		
		outputarray=replaceCharInString(a);
		
		printArraycontents(outputarray);

	}

}
