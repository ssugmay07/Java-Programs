package StringpgmsSet2;

import java.util.Arrays;

public class stringarraycomapre {
	
	public static int printOccurrenceOfMatchonfStringFromArray(String a1[],String a2[])
	{
		int count =0;
		
		String target=a2[0];
		char targetArray[]=target.toCharArray();
		Arrays.sort(targetArray);
		for(int i=0;i<a1.length;i++)
		{
			String match=a1[i];
			char matchArray[]=match.toCharArray();
			Arrays.sort(matchArray);
			
			if(compareTwoArrays(matchArray ,targetArray))
			{
				count++;
			}
		}
		
		return count;
	}

	public static boolean compareTwoArrays(char array1[],char array2[]) 
	{
		if(array1.length!=array2.length)
		return false;
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1[]= {"car","ear","cat","are","mat"};
		
		String a2[]= {"are"};
		
		int output=printOccurrenceOfMatchonfStringFromArray(a1,a2);
		
		System.out.println(output);
		
	}

}
