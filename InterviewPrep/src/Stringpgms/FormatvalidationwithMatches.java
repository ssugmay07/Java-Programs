package Stringpgms;

public class FormatvalidationwithMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="abcd-357-CDE";
		
		if(s.matches(("[a-z]{4}[-]{1}[0-9]{3}[-]{1}[A-Z]{3}")))
		{
			System.out.println("The string is matching the format");
		}
	}
}
