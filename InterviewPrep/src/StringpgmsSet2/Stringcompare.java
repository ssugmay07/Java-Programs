package StringpgmsSet2;

import java.util.HashMap;

public class Stringcompare {
	
	public static HashMap<Character,Integer> getCharCount(String s)
	{
		char c[]=s.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		for(Character i:c)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
				map.put(i,1);
			
		}
		
		
		return map;
	}
	
	public static boolean CompareMapsForChar(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2)
	{
		for(Character chars:map2.keySet())
		{
			if(map1.containsKey(chars))
			{
				if(map1.get(chars)<map2.get(chars))
					return false;
			}
			else
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="HeydearHowareyou";
		String s2="Howareyou";
		
		HashMap<Character,Integer>map1=getCharCount(s1);
		HashMap<Character,Integer>map2=getCharCount(s2);
		
		
		/*if(s1.contains(s2))
		{
			System.out.println(true);
		}*/
		
	}

}
