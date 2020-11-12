
package Basicjava;

public class Primenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int count =0;
		
		if(n==0||n==1)
		{
			System.out.println("no is not prime");
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
				
				
			}
		}
			
			if(count>0)
			{
				System.out.println("Number is not prime");
			}
			else
			{
				System.out.println("Number is prime");
			}
		}

	}


