package StringpgmsSet2;

public class ReverseWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hi GoodMorning to All";
		String split[]=s.split(" ");
		//String reverse="";
		String output="";
		
		for(int i=0;i<split.length;i++)
		{
			String temp=split[i];
			String reverse="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				reverse=reverse+temp.charAt(j);
			}
			output=output+reverse+" ";

		}
		//output=output+reverse+" ";
		System.out.println(output);

	}

}
