package Stringpgms;

import java.util.HashMap;

public class DuplicateStringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[]= {"sri","suganya","kayal","sri","anu","anu"};
		
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		for(String i:names)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
				map.put(i,1);
		}
		
		System.out.println("The duplicate strings in the array are :");
		for(String temp:map.keySet())
		{
			if(map.get(temp)>1)
			{
				System.out.println(temp);
			}
		}
		
	}

}
