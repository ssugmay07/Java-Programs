package Stringpgms;

import java.util.HashSet;

public class charOccurence {
	
	public static String findOccurenceOfChar(String s)
	{
		char c[]=s.toCharArray();
		HashSet set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		
		if(s.isEmpty() && s.length()<=0)
		{
			return "";
		}
		else
			for(Character chars:c)
			{
				if(!set.contains(chars))
				{
				set.add(chars);
				sb.append(chars);
				}
			}
			
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aabbccd";
		String s1="sa";
		
		String output=findOccurenceOfChar(s1);
		
		
		
		System.out.println(output);
	}

}
