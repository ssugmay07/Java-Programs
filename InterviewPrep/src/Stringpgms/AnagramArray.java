package Stringpgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AnagramArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"tea","mat","tom","eat","tap","mot","pat","sit"};
		
		ArrayList List=new ArrayList();
	
		
		/*for(String i:s)
		{
			List.add(i);
		}*/
		
		for(int i=0;i<s.length;i++)
		{
			String temp=s[i];
			char newtemp[]=temp.toCharArray();
			Arrays.sort(newtemp);
			
			String sortedstring=new String(newtemp);
			
			//List.add(sortedstring);
			
			for(int j=i+1;j<s.length;j++)
			{
				String temp1=s[i];
				char newtemp1[]=temp1.toCharArray();
				Arrays.sort(newtemp1);
				
				String sortedstring1=new String(newtemp1);
				if(sortedstring.contentEquals(sortedstring1))
						{
					
					       List.add(sortedstring1);
					      // List.add(s[j]);
					
						}
			}
		}
		
		System.out.println(List);
		
	//	Collections.sort(List);
		
		//System.out.println("&&&&&&&&&&&&&&&&");
		
		//System.out.println(List);
		
	}

}
