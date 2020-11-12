package Stringpgms;

import java.util.HashMap;

public class StringCompare {

	
	public static HashMap<Character,Integer> getCharCount(String a)
	{
		char[] newchar=a.toCharArray();
		HashMap<Character,Integer>charmap=new HashMap<Character,Integer>();
		
		for(Character c:newchar)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c,charmap.get(c)+1);
			}
			else
				charmap.put(c,1);
		}
		
		return charmap;
	}
	
	public static Boolean compareMaps(HashMap<Character,Integer>map1,HashMap<Character,Integer>map2)
	{
		for(Character c:map2.keySet())
		{
			if(map1.containsKey(c))
			{
				if(map2.get(c)>map1.get(c))
				{
					return false;
				}
			}
			else	
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="HeyDearHowareyou"; 
		String b="Howareyou";
		HashMap<Character,Integer>map1=new HashMap<Character,Integer>();
		HashMap<Character,Integer>map2=new HashMap<Character,Integer>();
		
		map1=getCharCount(a);
		map2=getCharCount(b);
		
		//System.out.print(map1);
		
		Boolean result=compareMaps(map1,map2);
		if(result==true)
		{
			System.out.println("The string2 is existing in string1");
		}
		else
			System.out.println("The string2 is notexisting in string1");

	}

}
