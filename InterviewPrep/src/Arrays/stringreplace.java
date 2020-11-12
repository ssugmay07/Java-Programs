package Arrays;

public class stringreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ip= "255.100.50.0" ;
		String split[]=ip.split("\\.");
		String op="";
		
		for(int i=0;i<split.length;i++)
		{
			op=op+split[i].concat("[.]");
		}
		
		System.out.println(op);
	}

}
