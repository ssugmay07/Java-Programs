package Stringpgms;

import java.util.HashSet;
import java.util.Iterator;

public class removeduplicatechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aabbccd";
		
		StringBuffer sb=new StringBuffer();
		
		char c[]=s.toCharArray();
		
		HashSet set=new HashSet<>();
		
		for(Character chars:c )
		{
			set.add(chars);
			//sb=sb.append(set);
		}
		
		 //Traversing elements  
		  Iterator<Character> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }
		//System.out.println(set);
		//System.out.println(sb.toString());
	}

}
