package Stringpgms;

public class Printstringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="suganya";
		char c[]=s.toCharArray();
		
		/*for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);	
		}*/
		//System.out.println(s.charAt(5));
		
		String str[]= {"Suganya","sri","Nirmal"};
		String cap="";
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i];
			
			char c1[]=s1.toCharArray();
			for(int j=0;j<c1.length;j++)
			{
				//System.out.println(c1[j]);
				if(Character.isUpperCase(c1[j]))
				{
					cap=cap+c1[j];
				}
			}
		}
		
		System.out.println(cap);

	}

}
