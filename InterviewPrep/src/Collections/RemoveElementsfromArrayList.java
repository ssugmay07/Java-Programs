package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveElementsfromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(30);
		list.add(4);
		list.add(5);
		list.add(20);
		
		//System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove(4);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(list.indexOf(20));
		
	
		//list.clone();
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		Collections.reverse(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
