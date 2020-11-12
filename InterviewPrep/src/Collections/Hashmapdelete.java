package Collections;

import java.util.HashMap;

public class Hashmapdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "aabbbCCd";
		char c[]=s.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character temp:c)
		{
			if(map.containsKey(temp))
			{
				map.put(temp, map.get(temp)+1);
			}
			else
				map.put(temp,1);
		}
		
		for(Character entry:map.keySet())
		{
			System.out.println(entry+" "+map.get(entry));
			
			if(map.get(entry)>1)
			{
				map.remove(entry);
			}
		}
		
		
	}

}
