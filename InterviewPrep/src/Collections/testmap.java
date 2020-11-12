package Collections;

import java.util.HashMap;

public class testmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  HashMap<String,String>namemap=new HashMap<String,String>();
			
		    namemap.put("a1234", "Steve Jobs");
		    namemap.put("a1235", "Scott McNealy");
		    namemap.put("a1236", "Jeff Bezos");
		    namemap.put("a1237", "Larry Ellison");
		    namemap.put("a1238", "Bill Gates");
		    
		   /* for (String key : namemap.keySet()) {
			    String value = namemap.get(key);
			    System.out.println("Key = " + key + ", Value = " + value);
		    */
		    
	if(namemap.containsKey("a1234"))	    
	{
		System.out.println(namemap.get("a1234"));
	}

	else
		System.out.println("Enter a valid key");
		}


	}


