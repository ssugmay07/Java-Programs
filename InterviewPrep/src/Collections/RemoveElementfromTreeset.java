package Collections;

import java.util.TreeSet;

public class RemoveElementfromTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        TreeSet<String> tree = new TreeSet<String>(); 
  
        tree.add("hi"); 
        tree.add("how"); 
        tree.add("are"); 
        tree.add("you"); 
      
        System.out.println("TreeSet: " + tree); 
  
        // Removing elements using remove() method 
        tree.remove("hi"); 
        
        
  
        // Displaying the TreeSet after removal 
        System.out.println("Treeset after removing element:" + tree); 
    } 

	}


