package Stringpgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ssuganya123_@gmail.com";
		
		Pattern p=Pattern.compile("[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]*[.]com");//[a-zA-Z0-9_.]*@gmail[.]com
		
		Matcher m=p.matcher(s);
		
		while(m.find())
		{
			System.out.println("Valid email id");
		}
		
		//To represent all names starting with a
		 //--->[aA][a-zA-Z]*
		
		//To represent all names ending with l
		//-->[a-zA-Z]*[lL]
		
		

	}

}
