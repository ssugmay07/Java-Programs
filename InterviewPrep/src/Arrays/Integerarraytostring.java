package Arrays;

import java.util.ArrayList;

public class Integerarraytostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		
		ArrayList<String> stringlist=new ArrayList<String>();
		
		String s="";
		for(int i=0;i<a.length;i++)
		{
			
			if(i==0)
			{
				s=s+s.valueOf(a[i]);
			}
			else
				
		 s=s+"+"+s.valueOf(a[i]);
		 stringlist.add(s);
		}
		
		System.out.println(s);
		
		System.out.println(stringlist);
	}

}
