package Collections;

public class Student implements Comparable<Student> {
	
	String name;
	int grade;
	int totalmarks;
	
	public Student(String name,int grade,int totalmarks)
	{
		this.name=name;
		this.grade=grade;
		this.totalmarks=totalmarks;
	}

	@Override
	public int compareTo(Student arg0) {


		return this.name.compareTo(arg0.name);
	}
	
	

}
