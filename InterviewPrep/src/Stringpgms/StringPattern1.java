package Stringpgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abaaabbab");
		
		int count=0;
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"......"+"....."+m.end()+"....."+m.group());
		}
		
		System.out.println("The total number of occurrences is "+" "+count);
		
		
	}

}
