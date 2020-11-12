package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// java pgm to store 5 integer values and sort in ascending order
		
		LinkedList<Integer> nolist=new LinkedList<Integer>();
		
		nolist.add(500);
		nolist.add(1500);
		nolist.add(200);
		nolist.add(50);
		nolist.add(2000);
		
		/*Iterator it=nolist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		/*for(Integer i:nolist)
		{
		
			System.out.println(i);
		*/
		
		System.out.println("Before Sort");
		
		for(int i=0;i<nolist.size();i++)
		{
			System.out.println(nolist.get(i));
		}
		
		Collections.sort(nolist);
		
       System.out.println("After Sort");
		
		for(int i=0;i<nolist.size();i++)
		{
			System.out.println(nolist.get(i));
		}
		
		
		}
		
	
	}


