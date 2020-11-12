package Stringpgms;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramArraynew {
	
	public static ArrayList<String> checkAnagram(String s1,String s2)
	{
		
		ArrayList List=new ArrayList<>();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//Convert character array  to string
		
		String newS1=new String(ch1);//String newS1=String.valueOf(ch1);
		String newS2=String.valueOf(ch2);
		
		if(newS1.equals(newS2))
		{
			//System.out.println("The given strings are anagram");
			List.add(s1);
			List.add(s2);
			
		}
		//else
			//System.out.println("The given strings are NOT anagram");
		return List;

	}
	
	public static void FindAnagram(String s[])
	{
		ArrayList anagramlist=new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			String s1=s[i];
			for(int j=i+1;j<s.length;j++)
			{
				String s2=s[j];
				
				anagramlist=checkAnagram(s1,s2);
				if(anagramlist.size()>0)
					System.out.println(anagramlist);
				

				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"tea","mat","tom","eat","tap","mot","pat","sit"};
		//ArrayList anagramlist=new ArrayList<>();

	FindAnagram(s);
	}

}
