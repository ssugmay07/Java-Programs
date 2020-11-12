package StringpgmsSet2;

public class checkSecondwordOcccurrenceinFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String s1="Hello world Java is the best programming language in the world";
		String s2="world";
		int count=0;
		
		String split[]=s1.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
		String match=split[i];
		if(match.equals(s2)) {
			count++;
		}
		
}
		
		System.out.println(count);
}
}
