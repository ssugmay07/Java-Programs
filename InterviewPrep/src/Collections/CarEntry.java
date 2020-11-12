package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CarEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car(1000,4,4);
		Car car2=new Car(8000,4,7);		
		Car car3=new Car(5000,4,2);
		Car car4=new Car(10000,12,10);
		Car car5=new Car(2000,5,4);
		
		ArrayList<Car> carlist=new ArrayList<>();
		carlist.add(car1);
		carlist.add(car2);
		carlist.add(car3);
		carlist.add(car4);
		carlist.add(car5);
		
		System.out.println("Before Sort");
		for(Car i:carlist)
		{
			System.out.println("car engineCapacity : "+ i.seatingCapacity);
		}
		Collections.sort(carlist);
		
		System.out.println("After Sort");
		for(Car i:carlist)
		{
			System.out.println("car engineCapacity : "+ i.seatingCapacity);
		}

	}

}
