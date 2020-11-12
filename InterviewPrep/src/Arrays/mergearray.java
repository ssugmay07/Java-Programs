package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		
		ArrayList<Integer>a1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			a1.add(a[i]);
		}
		
ArrayList<Integer>a2=new ArrayList<Integer>();
		
for(int i=0;i<b.length;i++)
{
	a2.add(b[i]);
}
		
a2.addAll(a1);
		System.out.println(a2);
		
		Collections.sort(a2);
		System.out.println("After sort :");
		System.out.println(a2);
	}

}
