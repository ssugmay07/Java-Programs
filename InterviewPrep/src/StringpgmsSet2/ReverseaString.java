package StringpgmsSet2;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="suganya";
		
		/*String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println(reverse);*/
		
		StringBuffer sb=new StringBuffer(s);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
	}

}
