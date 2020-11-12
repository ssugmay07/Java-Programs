package Stringpgms;

public class NumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="(123)-(455)-(6859)";//
		
		//String s="1234578961";
		
		String s="-234-435-99890";
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
		
		if(s.matches(("[(]{1}[0-9]{3}[)]{1}[-]{1}[(]{1}[0-9]{3}[)]{1}[-]{1}[(]{1}[0-9]{4}[)]{1}")))
		{
			count=0;
		}
		
		else if(s.charAt(i)>='0'&&s.charAt(i)<='9'&&s.length()==10)
		{
			count=0;
			
		}
		
		else
			count=1;
	}
		
		if(count>0)
		{
			System.out.println("The string is NOT a valid phone number");
		}
		else
			System.out.println("The string is valid phone number");

}
}
