package Collections;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>set1=new HashSet<Integer>();
		
		for(int i=0;i<5;i++)
		{
			set1.add(i);
		}
		
		//System.out.println(set1);
		Object[] a=set1.toArray();
		
		System.out.println("The array is:"); 
        for (int j = 0; j < a.length; j++) 
            System.out.print(a[j]+" "); 
	}

}
