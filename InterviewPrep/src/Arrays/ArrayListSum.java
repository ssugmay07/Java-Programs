package Arrays;

import java.util.ArrayList;

public class ArrayListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,2,3,4,6,5};
		ArrayList<Integer> sumlist=new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sumlist.add(a[i]);
		}

		System.out.println(sumlist);
		for(Integer temp:sumlist)
		{
			sum=sum+sumlist.get(temp);
		}
		
		System.out.println(sum);
	}

}
