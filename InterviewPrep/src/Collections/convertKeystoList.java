package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class convertKeystoList {

	//WJP to Convert keys of a map to List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		map.put(100,1);
		map.put(200,2);
		map.put(300,3);
		map.put(400,4);
		map.put(500,5);
		
		for(Integer i:map.keySet())
		{
			list.add(i);
		}
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
