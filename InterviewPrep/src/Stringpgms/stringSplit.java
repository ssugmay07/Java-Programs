package Stringpgms;

import java.util.Arrays;

public class stringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="bbaaccaa";
		String arr1[]= s.split("a", -1);
		for(int i=0;i<arr1.length;i++)
		{
		System.out.println(arr1[i]);
		}
		//to convert string array to string
		String stringArray[] = {"Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
		
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < stringArray.length; i++) {
	         sb.append(stringArray[i]);
	      }
	      
	      System.out.println(sb);

	      String str = sb.toString();
	     // System.out.println(str);

	}

}
