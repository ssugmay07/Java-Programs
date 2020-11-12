package Stringpgms;

import java.util.HashSet;

public class stringreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I love Java Programming";
		
		String s2="o";
		
		
		String newstring=s.replace(" ", "");
		
		System.out.print(newstring);
		
		System.out.println();
		
		HashSet<Character> resultset=new HashSet<Character>();
		int start=newstring.indexOf('o');
		int end=newstring.lastIndexOf('o');
		String temp="";
		char output = 0;
		for(int i=start+1;i<end;i++)
		{
			System.out.print(newstring.charAt(i));
			//resultset.add(output);
			
		}
		
		//System.out.print();
		
	}

}
