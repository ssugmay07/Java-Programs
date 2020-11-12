package Arrays;

public class findSmallestandBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,300,3,1,89,900,400,5};
		
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else
				min=a[i];
		}
		
System.out.println("The smallest is : "+min);
		
		System.out.println("The largest is : "+max);
		
	}

}
