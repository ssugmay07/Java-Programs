package Stringpgms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LeastduplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ABCAABCAEBE";

		char[] c=s.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		int min=100;
		
		for(Character temp:c)
		{
			if(map.containsKey(temp))
			{
				map.put(temp,map.get(temp)+1);
			}
			else
				map.put(temp,1);
		}
		
		System.out.println(map);
		
		for(Character keys:map.keySet())
		{
			if(map.get(keys)<min)
			{
				min=map.get(keys);
			}
			
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		
		System.out.println("The least duplicate occuring string is :");
        for(Entry<Character, Integer> mapchar:set)
        {
        	if(mapchar.getValue()==min)
        	{
        		System.out.println(mapchar.getKey());
        	}
	
         }
		
		
		
		//System.out.println(min);
	}

}
