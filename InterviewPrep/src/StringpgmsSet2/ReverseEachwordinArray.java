package StringpgmsSet2;

public class ReverseEachwordinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"Hi","How","are","you"};
		
		String reverse[]=new String[s.length];
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String reverseword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
				reverse[count]=reverseword;
				//count++;
			}
			count++;
		}
		
		for(int i=0;i<reverse.length;i++)
		{
			System.out.print(reverse[i]+" ");
		}

	}

}
