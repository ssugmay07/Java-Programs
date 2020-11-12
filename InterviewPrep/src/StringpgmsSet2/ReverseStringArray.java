package StringpgmsSet2;

public class ReverseStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Hi","How","are","you"};
		String reverse[]=new String[s.length];
		int count=0;
		
		for(int i=s.length-1;i>=0;i--)
		{
			//String word=s[i];
			
			reverse[count]=s[i];
			count++;
		}
		
		for(int i=0;i<reverse.length;i++)
		{
			System.out.print(reverse[i]+" ");
		}
		
	}

}
