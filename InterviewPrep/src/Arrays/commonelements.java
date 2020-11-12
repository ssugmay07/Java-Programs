package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class commonelements {

	//array1{1,2,3,4,5} array2{1,5,8,4,2} find common elements
	public static void main(String[] args) {
		
		
		int array1[]= {1,2,3,4,5};
		
		int array2[]= {1,5,8,4,2};
		
		ArrayList<Integer> arraylist1 =new ArrayList<Integer>(); 
		for(int i=0;i<array1.length;i++)
		{
			//arraylist1.add(new Integer(array1[i]));
			arraylist1.add(array1[i]);
		}
		
		ArrayList<Integer> arraylist2 =new ArrayList<Integer>(); 
		for(int i=0;i<array1.length;i++)
		{
			//arraylist1.add(new Integer(array1[i]));
			arraylist2.add(array2[i]);
		}

for(Integer i:arraylist1)
{
	for(Integer j:arraylist2)
	{
		//System.out.println(i);
		//System.out.println(j);
		if(i==j)
		{
			System.out.println(i);
		}
	}
}
		
		

	}

}
