package Stringpgms;

public class ExtractNosFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="34a$ry000!TS32_+)0";
		String numbers="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				numbers=numbers+s.charAt(i);
			}
		}
		
		System.out.println(numbers);

	}

}
