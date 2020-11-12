package Stringpgms;

public class countnoOfWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I went to school today";
		String split[]=s.split(" ");
		int count=0;
		
		System.out.println("The no of words in the string is :"+split.length);
		
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		
	}

}
