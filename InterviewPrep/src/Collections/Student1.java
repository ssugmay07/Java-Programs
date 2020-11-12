package Collections;

public class Student1 {
	
	private String name;
	private int regno;
	
	public Student1(String name,int regno)
	{
		super();
		this.name=name;
		this.regno=regno;
	}
	
	public String getStudentName()
	{
		return name;
	}
	
	public void setStudentName(String name)
	{
		this.name=name;
	}
	
	public int getStudentRegNo()
	{
		return regno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + regno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regno != other.regno)
			return false;
		return true;
	}

	public void setStudentRegNo(int regno)
	{
		this.regno=regno;
	}
	public void displayStudentInfo()
	{
		System.out.println("Student Name:"+getStudentName()+" "+"Student Regno: "+getStudentRegNo());
		
	}

	//@Override
/*	public int compareTo(Student1 arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);*/
	}
	
	

