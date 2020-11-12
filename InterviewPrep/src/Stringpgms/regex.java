package Stringpgms;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phoneNumber="@1234588999300)";
	    
	    phoneNumber=phoneNumber.replaceAll("[^0-9]","");
	    System.out.println(phoneNumber);

	}

}
