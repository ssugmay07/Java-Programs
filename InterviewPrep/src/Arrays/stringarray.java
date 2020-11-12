package Arrays;

// Input String {1,2,3,4,5} o/p: Add odd numbers java program
public class stringarray {

	public static void main(String[] args) {

 //String s[]= {"1","2","3","4","5"};
 
// String s1= "1,2,3,4,15";
		
 //String[] split=s1.split(",");
		
		String s="12345";
 
 int sum=0;
 
 /*for(int i=0;i<s.length;i++)
 {
	 int temp=Integer.parseInt(s[i]);
	 
	 if(temp%2!=0)
	 {
		 sum=sum+temp;
	 }
 }*/
 
/* for(int i=0;i<split.length;i++)
 {
int temp=Integer.parseInt(split[i]);
	 
	 if(temp%2!=0)
	 {
		 sum=sum+temp;
	 }
 }*/
 
 
 for(int i=0;i<s.length();i++)
 {
	 int temp=Integer.parseInt(s.valueOf(s.charAt(i)));
	 
	/* if(temp%2!=0)
	 {
		 sum=sum+temp;
	 }*/
	 
	 sum=sum+temp;
 }
 System.out.println(sum);

	}

}
