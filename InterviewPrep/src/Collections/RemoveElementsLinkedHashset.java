package Collections;

import java.util.LinkedHashSet;

public class RemoveElementsLinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		
		 set1.add(1); 
         set1.add(2); 
         set1.add(3); 
         set1.add(4); 
         set1.add(5); 
         
         System.out.println("LinkedHashSet before removing all elements :"+set1);
                
		//set1.removeAll(set1);
         set1.clear();
		

        System.out.println("LinkedHashSet after removing all elements :"+set1);
	}

}
