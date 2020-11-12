package Stringpgms;

public class CharOccurrencewithoutcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbccd";
		
		char c[]=s.toCharArray();
		
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			
			System.out.println("The occurrence of "+c[i]+" "+count+" "+"times");
			count=0;
			
		}

	}

}
