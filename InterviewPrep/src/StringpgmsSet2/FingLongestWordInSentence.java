package StringpgmsSet2;

public class FingLongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to the world of Programming Ppprogramming";
		
		String split[]=s.split(" ");
		int maxLength=split[0].length();
		String maxLengthWord="";
		
		for(int i=0;i<split.length;i++)
		{
			if(split[i].length()>maxLength)
			{
				maxLength=split[i].length();
				maxLengthWord=split[i];
				
				
				
			}
		}
		
		System.out.println(maxLength+"...."+maxLengthWord);

	}

}
