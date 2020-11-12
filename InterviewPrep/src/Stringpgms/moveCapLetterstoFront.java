package Stringpgms;

public class moveCapLetterstoFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stubAPhpy
		
		String  s="APhpy";
		
		String caps="";
		String low="";
		String output="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isUpperCase(ch))
			caps=caps+ch;
			else
				low=low+ch;
		}
		
output=output+caps+low;

System.out.println(output);
	}

}
