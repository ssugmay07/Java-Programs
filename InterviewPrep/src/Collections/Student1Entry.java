package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student1Entry {

	public static void main(String[] args) {
		// Create Student with name and regno attributes.use any collection to store 5 student information.
		//Sort students using name(only unique student objects should be printed)
		//Ex:s1(aa,11),s2(aa,12),s3(aa,11),s4(bb,12) then s1(aa,11),s2(aa,12),s4(bb,12) should be printed.
		
		Student1 s1=new Student1("aa",11);
		Student1 s2=new Student1("aa",12);
		Student1 s3=new Student1("aa",11);
		Student1 s4=new Student1("bb",12);
		
		//using HashMap to store student info
		
	/*	HashMap<Integer,Student1> studentmap=new HashMap<Integer,Student1>();
		
		studentmap.put(s1.getStudentRegNo(),s1);
		studentmap.put(s2.getStudentRegNo(),s2);
		studentmap.put(s3.getStudentRegNo(),s3);
		studentmap.put(s4.getStudentRegNo(),s4);
		
		Set<Map.Entry<Integer,Student1>>entries=studentmap.entrySet();	
		for(Map.Entry<Integer,Student1> smap:entries)
		{
			System.out.println(smap.getKey());
			Student1 student=smap.getValue();
			
			student.displayStudentInfo();
		}
	*/
		HashSet<Student1> set1=new HashSet<Student1>();
		//TreeSet<Student1> set1=new TreeSet<Student1>();
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		
		
for(Student1 stdset:set1)
{
	System.out.println(stdset.getStudentName());
	stdset.displayStudentInfo();
}


//Collections.sort((List<T>) set1);

	}


	
}
