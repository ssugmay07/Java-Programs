package Arrays;

public class SecondlargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,5,6,3,2};  
		
		int temp, size;
		size = a.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(a[i]>a[j]){
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+a[size-2]);

	}

}
