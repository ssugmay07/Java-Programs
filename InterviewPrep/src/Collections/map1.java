package Collections;

import java.util.HashMap;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		HashMap<Integer,String>nummap=new HashMap<Integer,String>();
		
		nummap.put(1,"one");
		nummap.put(2,"two");
		nummap.put(3,"three");
		nummap.put(4,"four");
		nummap.put(5,"five");
		nummap.put(6,"six");
		
		/*for (Integer key : nummap.keySet()) {
		    String value = nummap.get(key);
		    System.out.println("Key = " + key + ", Value = " + value);
		    */
		
		nummap.keySet();
		
		 System.out.println("The value of 6 is :"+nummap.get(6));

	}

}
