package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintOddandEvenNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]= {7,4,8,3,2,10,6,5};
		int[] output=new int[input.length];
		
		Arrays.sort(input);
		Boolean even=true;
		
		int minsize=0;
		
		ArrayList<Integer> oddlist=new ArrayList<Integer>();
		ArrayList<Integer> evenlist=new ArrayList<Integer>();
		ArrayList<Integer> resultlist=new ArrayList<Integer>();
		
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
			
			if(input[i]%2==0)
			{
				even=true;
				evenlist.add(input[i]);
				
			}
			else
				oddlist.add(input[i]);
		}
		
		if(oddlist.size()>evenlist.size())
		{
			minsize=evenlist.size();
		}
		else
			minsize=oddlist.size();
		
		resultlist.add(evenlist.get(0));
		for(int i=0;i<minsize;i++)
		{
			
			resultlist.add(oddlist.get(i));
			resultlist.add(evenlist.get(i+1));
			
		}
		
		System.out.println(evenlist);//2,4,6,8,10
		System.out.println(oddlist);//3,5,7
		System.out.println(resultlist);//2,3,4,5,6,7,8
		

	}

}
