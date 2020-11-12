package Collections;

public class Car implements Comparable<Car>  {

	int engineCapacity=0;
	int noOfWheels=0;
	int seatingCapacity=0;
	
	
	
	public Car(int ec)
	{
		this.engineCapacity=ec;
		
	}
	
	public Car(int ec,int nw,int sc)
	{
		this.engineCapacity=ec;
		this.noOfWheels=nw;
		this.seatingCapacity=sc;
		
	}

	@Override
	public int compareTo(Car o) {
		
		return this.seatingCapacity - o.seatingCapacity;
	}
		

	}


