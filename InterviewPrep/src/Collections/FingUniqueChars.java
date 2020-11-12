package Collections;

import java.util.HashMap;

class FingUniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="SuganyaS";
		
		char[] name=S.toCharArray();
		
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(Character temp:name)
		{
			if(hm.containsKey(temp))
			{
				hm.put(temp,hm.get(temp)+1);
				
			}
			else
				hm.put(temp,1);
		
		}
		
		System.out.println(hm);
		
		for(Character keys:hm.keySet())
		{
			if(hm.get(keys)==1)
			{
				System.out.println(keys);
				//break;
			}
		}

	}

}
