package Arrays;

public class FindMissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {22,23,24,25,27,28,29,30};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int sum1=0;
		for(int j=22;j<=30;j++)
		{
			sum1=sum1+j;
		}

		int op=sum1-sum;
		System.out.println(op);
	}

}
