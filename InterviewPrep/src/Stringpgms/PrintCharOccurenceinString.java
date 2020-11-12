package Stringpgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintCharOccurenceinString {
	
	public static HashMap<Character,Integer> findOccurence(String s)
	{
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		char c[]=s.toCharArray();
		
		if(s.length()<=0||s.isEmpty())
		{
			return map;
		}
		else
			for(Character chars:c)
			{
				if(map.containsKey(chars))
				{
					map.put(chars, map.get(chars)+1);
				}
				else
					map.put(chars, 1);
			}
		
		
			
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="AAbbbccd";
		HashMap<Character,Integer>resultmap=new HashMap<Character,Integer>();
		resultmap=findOccurence(s);
		
		System.out.println(resultmap);
		
	}

}
