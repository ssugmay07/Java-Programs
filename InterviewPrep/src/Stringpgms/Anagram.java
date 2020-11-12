package Stringpgms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="teaa";
		String s2="eat";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//Convert character array  to string
		
		String newS1=new String(ch1);//String newS1=String.valueOf(ch1);
		String newS2=String.valueOf(ch2);
		
		if(newS1.equals(newS2))
		{
			System.out.println("The given strings are anagram");
			
		}
		else
			System.out.println("The given strings are NOT anagram");

	}

}
