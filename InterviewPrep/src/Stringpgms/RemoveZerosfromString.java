package Stringpgms;

public class RemoveZerosfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String s="00051700";
		String s="c00l0000";
		
		//1) use regular expressions to remove all zeros
		
		//s=s.replaceAll("[^1-9]", "");
		
		//System.out.println(s);
		
		//2) to remove the leading zeros
		//(Where the “^” tells to search from the start of the string and 0+ is for one or more zeros. Basically we want to replace all the zeros from start of the string with empty string value thus removing them)
		//s=s.replaceAll("^0+", "");
		
		//System.out.println(s);
		
		//3) using for loop and substring method(to remove leading zeros)
		
		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0')
			{
				s=s.substring(i);
				break;
			}
		}
		
		System.out.println(s);*/
		
		//4) using index of method and substring method
		
		/*while(s.indexOf("0")==0)
		{
			s.substring(1);
			
		}
		
		System.out.println(s);*/
		
		
		//to remove trailing zeros
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!='0')
			{
				s=s.substring(0,i+1);//to print the values from begin index till index last,in this case i value is 3(so 0 to 3+1,to print till before start of zero(ie ,i))
				break;
			}
		}
		
		System.out.println(s);

	}
	
	
	
	
}
