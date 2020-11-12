package StringpgmsSet2;

public class CheckUppercaseinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="AtyyHUYs";
		String uppercase="";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				uppercase=uppercase+s.charAt(i);
				count++;
			}
		}
		
		System.out.println(uppercase+"....."+count);
	}

}
