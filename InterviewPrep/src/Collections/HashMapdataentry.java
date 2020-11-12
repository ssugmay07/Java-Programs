package Collections;

import java.util.HashMap;

public class HashMapdataentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		map.put("s",1);
		map.put("u",1);
		map.put("g",1);
		map.put("a",2);
		map.put("n",1);
		map.put("y",1);
		map.put("a",3);
		map.put("s",2);
		
		System.out.println(map);
		map.remove("s");
		
		System.out.println(map);
		
	}

}
