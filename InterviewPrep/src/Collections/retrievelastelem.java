package Collections;

import java.util.LinkedList;

public class retrievelastelem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
      System.out.println("Original linked list: " + c1);    
 // Retrieve but does not remove, the last element of a linked list
    String  lastelement= c1.peekLast();
System.out.println("Last element in the list: " + lastelement);
System.out.println("Original linked list: " + c1);

	}

}
