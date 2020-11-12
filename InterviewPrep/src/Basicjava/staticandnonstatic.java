package Basicjava;

public class staticandnonstatic {
	
	static String name ="suganya";
	
	int age=32;
	
	public static void getAge(String name)
	{
		System.out.println(name);
	}
	
	public void getname(String name)
	{
		age=40;
		name="sugan";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticandnonstatic obj=new staticandnonstatic();
		//System.out.println(obj.age);
		//System.out.println(name);
		getname("s");
		
	}

}
