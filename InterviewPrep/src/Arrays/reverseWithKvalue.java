package Arrays;

public class reverseWithKvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = { 3, 2, 4, 7, 0, 3, 1, 5, 8,4};

		int k = 3;
		int temp=k;
		int temp1=0;
		for (int i = k; i <=k; i++) 
		{
			for (int j = k - 1; j >= k - temp; j--) 
			{
				if(j<a.length)
					System.out.print(a[j] + " ");
				temp1=j+k;
			}
			//if(k<a.length)
			{
			k = k + temp;
			
			if(k>=a.length)
			{
			 for( i=temp1+1;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
				break;
			}
			
			}
		}
	}

	}

