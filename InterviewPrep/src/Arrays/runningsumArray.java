package Arrays;

import java.util.ArrayList;

public class runningsumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};
		
		ArrayList<Integer>sumarray=new ArrayList<Integer>();
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			sumarray.add(sum);
		}
		
		System.out.println(sumarray);
	}

}
