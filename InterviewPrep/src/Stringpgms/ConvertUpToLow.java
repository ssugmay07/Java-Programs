package Stringpgms;

import java.util.Scanner;

public class ConvertUpToLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 String st;
		 int i;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any string which is to be converted to lowercase");
		 st=sc.nextLine();
		 char str[]=st.toCharArray();
		     for(i=0;i<str.length;i++)
		     {
		         if(str[i]>='A' && str[i]<='Z')
		         { 
		         str[i]=(char)((int)str[i]+32);
		         }
		     }
		     System.out.println("The string in LowerCase is");
		 for(i=0;i<str.length;i++)
		     System.out.print(str[i]);
		 }
	}


