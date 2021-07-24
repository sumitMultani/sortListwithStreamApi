package com.practice.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(8);
		numbers.add(5);
		numbers.add(19);

		Collections.sort(numbers);// ascending order
		System.out.println("Ascending order : " + numbers);

		Collections.reverse(numbers); // descending order
		System.out.println("Descending order : " + numbers);

		// use stream api
		System.out.println("Ascending order using stream api");
		numbers.stream().sorted().forEach(System.out::println); // ascending order

		System.out.println("Descending order using stream api");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); // descending order

		// But this approach will work in case of if list contains only primitive data
		// types.
		// If we want to sort a custom class like employee, Student etc. any class, then
		// i want to sort on a specific field
		// like student rollno,student marks. In that case we need to go for comparator.

		// sorting traditional logic by rollno
		List<Student> studentList = Student.getStudentList();
		
		//Collections.sort(studentList, new MyComparator());
		
		// use annonymous inner type.
//		Collections.sort(studentList, new Comparator<Student>() {
//			// add the unimplemented method
//			@Override
//			public int compare(Student s1, Student s2) {
//				//return s1.getRollNo() - s2.getRollNo(); // Ascending order
//				return s2.getRollNo() - s1.getRollNo(); // descending Order
//			}
//		});
		
		 
		// instead of anonymous inner classes . we can also go for lambda expression.
		Collections.sort(studentList, (s1, s2) ->  s1.getRollNo() - s2.getRollNo());
		System.out.println("Ascending student List : " + studentList);
		
		// sort list using stream api.
		List<Student> studentList2 = Student.getStudentList();
		//jstudentList2.stream().sorted((s1, s2) ->  s1.getRollNo() - s2.getRollNo()).forEach(stu -> System.out.println(stu));
	
	// sort list final way
	//studentList2.stream().sorted(Comparator.comparing(st -> st.getRollNo())).forEach(System.out::println);
	
		
		// sort list with method reference
	//studentList2.stream().sorted(Comparator.comparing(Student :: getRollNo)).forEach(System.out::println);
		
		studentList2.stream().sorted(Comparator.comparing(Student :: getMarks)).forEach(System.out::println);
	}
	
	
	
	 
	
}

//instead of creating a separate class . we can use directly this code (below written).

// create our own comparator with traditional approach
//class MyComparator implements Comparator<Student> {
//
//	@Override
//	public int compare(Student s1, Student s2) {
//		//return s1.getRollNo() - s2.getRollNo(); // Ascending order
//		return s2.getRollNo() - s1.getRollNo(); // descending Order
//	}

	
//}