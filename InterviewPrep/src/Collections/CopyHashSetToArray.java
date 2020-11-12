package Collections;

import java.util.HashSet;

public class CopyHashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of HashSet
	    HashSet hset = new HashSet();
	   
	    //add elements to HashSet object
	   hset.add("suganya");
	   hset.add("2");
	   hset.add(3);
	   hset.add(4);
	   hset.add(5);
	   
	    /*
	      To copy all elements of java HashSet object into array use
	      Object[] toArray() method.
	    */
	   
	    Object[] objArray = hset.toArray();
	   
	    //display contents of Object array
	    System.out.println("HashSet elements are copied into an Array Now Array Contains..");
	    for(int index=0; index < objArray.length ; index++)
	      System.out.println(objArray[index]);
	  }

	}


