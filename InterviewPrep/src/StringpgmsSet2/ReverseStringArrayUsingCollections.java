package StringpgmsSet2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseStringArrayUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Hi","How","are","you"};
		
		ArrayList<String>list=new ArrayList<String>();
		for(String i:s)
		{
			list.add(i);
		}
		
		Collections.reverse(list);
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
