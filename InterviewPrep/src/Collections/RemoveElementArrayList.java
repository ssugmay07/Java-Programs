package Collections;

import java.util.ArrayList;

public class RemoveElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(3);
		
		System.out.println("The elements in the list before removal:"+list);
		
		list.remove(3);
		
		System.out.println("The elements in the list after removal:"+list);
		
		
	}

}
