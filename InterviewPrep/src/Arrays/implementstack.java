package Arrays;

import java.util.LinkedList;

public class implementstack {
	

	LinkedList<Integer> ll=new LinkedList<Integer>();
	
	public void push(int a)
	{
		ll.add(a);
	}
	
	public void pop()
	{
		ll.removeLast();
	}

	public int peek()
	{
		return (ll.get(ll.size()-1));
	}
	
	void print()
	{
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		implementstack stack=new implementstack();
		stack.print();
		
	}
}


