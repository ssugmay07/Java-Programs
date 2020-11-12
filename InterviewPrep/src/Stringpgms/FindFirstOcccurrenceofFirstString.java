package Stringpgms;

import java.util.ArrayList;

public class FindFirstOcccurrenceofFirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="hello";
		String s2="ll";
		//int index=s1.indexOf(s2);
		int index2=s1.indexOf('l', 3);
		
		//System.out.println(index);
		System.out.println(index2);
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		ArrayList<Character>list1=new ArrayList<Character>();
		ArrayList<Character>list2=new ArrayList<Character>();
		
		for(Character char1:c1)
		{
			list1.add(char1);
		}
		
		for(Character char2:c2)
		{
			list2.add(char2);
		}
		
		/*if(list1.contains(list2))
		{
			System.out.println("The index of the element l in ArrayList is: " +
				     list1.indexOf('l'));
		}*/
		
		list1.retainAll(list2);
		
		System.out.println(list1.contains(list2));
		 System.out.println(list1);
		
	}

}
