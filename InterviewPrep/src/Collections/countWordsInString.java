package Collections;

import java.util.HashMap;

public class countWordsInString {

	//Write a Java Program to count the number of words in a string using HashMap.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Hi Have a Good Day";
		
		String[] split=s.split(" ");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		for(String i:split)
		{
			if(map.containsKey(i))
			{
				
			map.put(i,map.get(i)+1);
			}
			else
				map.put(i,1);
		}
		
		System.out.println("The total number of words in string is :"+map.size());
	}
	

}
