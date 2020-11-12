package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentEntry {

	public static void main(String[] args) {
		//create student class with name,grade and totalmarks attributes.Store 5 student information
		//sort stdent objects according to student name.
		
		Student student1=new Student("Kayal",2,85);
		Student student2=new Student("Anu",3,70);
		Student student3=new Student("Sri",1,95);
		Student student4=new Student("Banu",4,60);
		Student student5=new Student("Asha",5,50);
		
		ArrayList<Student> studentlist=new ArrayList<Student>();
		
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		studentlist.add(student5);
		
         System.out.println("Before Sort");
		
		for(Student stdlist:studentlist)
		{
			System.out.println(stdlist.name);
		}
		
		Collections.sort(studentlist);
		

		System.out.println("****************************************");
		
		
		System.out.println("After Sort");
		
		for(Student stdlist:studentlist)
		{
			System.out.println(stdlist.name);
		}
		
	}

}
