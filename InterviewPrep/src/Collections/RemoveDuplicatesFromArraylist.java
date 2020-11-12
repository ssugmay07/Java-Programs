package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(3);
		
		System.out.println("The elements in the list before removing duplicates are :"+list);
		
		System.out.println("The elements in the list after removing duplicates are :");
		
		HashSet<Integer>set=new HashSet<Integer>(list);
		
		
			System.out.println(set);
		
		

	}

}
