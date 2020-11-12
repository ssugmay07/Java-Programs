package Stringpgms;

public class stringreverse {
	
	public static String reverseString(String s)
	{
		String reversestring="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reversestring=reversestring+s.charAt(i);
		}
	
		return reversestring;
	}

	
	public static String reverseStringrecursion(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseStringrecursion(str.substring(1)) + str.charAt(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Suganyas";
		
		String op=reverseString(s);
		
		System.out.println(op);
		
		String revop=reverseStringrecursion(s);
		System.out.println(revop);
	}

}
