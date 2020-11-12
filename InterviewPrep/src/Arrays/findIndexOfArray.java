package Arrays;

public class findIndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,5,3,9,7,3,2,4};
		int index=0;
		//int element=a[5];
		int element=3;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("The index of "+element+" "+"is"+" "+i);
			}
		}

	}

}
