package StringpgmsSet2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TocheckIfStringHasOnlyDigits {

	/*public static boolean IsDigit(String s)
	{
		String regex="[0-9]+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		if(s.length()==0)
		return false;
		
		return m.matches();
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1234";
		
		
		/*if(IsDigit(s))
		{
			System.out.println("String contains only digits");
		}*/
		
		//System.out.println(IsDigit(s));
		
		String regex="[0-9]+";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.matches(regex))
		{
			count++;
		}

	}
		System.out.println(count);
	}

}
