package Collections;

import java.util.LinkedHashSet;

public class checkParticularElementInLinkedHashset {

	//5. Check if a particular element exists in Java LinkedHashSet Example
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet set1=new LinkedHashSet<>();
		
		set1.add("red");
		set1.add("green");
		set1.add("blue");
		
		if(set1.contains("green"))
		{
			System.out.println("The element exists");
		}
		else
			System.out.println("The element NOT exists");
			
		

	}

}
