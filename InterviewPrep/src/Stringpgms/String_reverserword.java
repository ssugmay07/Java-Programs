package Stringpgms;

public class String_reverserword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S="Good Morning to all";
		String[] split=S.split(" ");
		String Output="";
		//String Reverse_word=" ";
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			String Reverse_word="";
			for(int j=word.length()-1;j>=0;j--)
			{
				Reverse_word=Reverse_word+word.charAt(j);
				
			}
			Output=Output+Reverse_word+" ";
		}
		System.out.println(Output);

	}

}
