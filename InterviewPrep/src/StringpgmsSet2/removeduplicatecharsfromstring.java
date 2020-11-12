package StringpgmsSet2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeduplicatecharsfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s="Hi this is Sample";
		String s="hi this is sample test";
		
		char c[]=s.toCharArray();
		
		LinkedHashSet set=new LinkedHashSet<>();
		
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		}
		
		//System.out.println(set);
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}

}
