package StringpgmsSet2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Hashmapbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="suganyas";
		
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for(char i:s.toCharArray())
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			
			else
				map.put(i,1);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			
			System.out.println(entry.getKey()+"......"+entry.getValue());;
			//entry.getValue();
			
		}
		
		for(Character keys:map.keySet())
		{
			int value=map.get(keys);
			
			Character key=keys;
			
			System.out.println(key+"...."+value);
		}
		
	}

}
