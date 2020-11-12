package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> numberlist=new LinkedList<Integer>();
		numberlist.add(800);
		numberlist.add(1800);
		numberlist.add(500);
		numberlist.add(8000);
		numberlist.add(2000);
		
		/*Iterator<Integer> it=numberlist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		Collections.sort(numberlist);
		System.out.println(numberlist);
		
		
		
	}

}
