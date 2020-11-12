package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicatesfromsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,1,2};
		
		ArrayList<Integer>List=new ArrayList<Integer>();
		for(int i:nums)
		{
			List.add(i);
		}
		
		TreeSet<Integer> set = new TreeSet<Integer>(List);
		Iterator it=set.iterator();
		/*while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		
		System.out.println("The length of new array is : "+set.size());*/
		int counter=0;
		for(int i:set)
		{
			nums[counter]=i;
			counter++;
		}
		
		for(int i=0;i<nums.length;i++)
		{
		  System.out.println(nums[i]);
			
		}
	}

}
