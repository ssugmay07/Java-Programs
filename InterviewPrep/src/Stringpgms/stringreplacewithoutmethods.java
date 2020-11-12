package Stringpgms;

public class stringreplacewithoutmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		char temp;
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

		System.out.println(newString);
	}

}
