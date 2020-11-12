package Stringpgms;

public class removeparticularcharfromstringwithreplacechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Suganyas";
		
		char c='g';
		
		String op="";
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)==c))
			{
				op=op+s.charAt(i);
				
			}
		}
		
		System.out.println(op);
		
	}

}
