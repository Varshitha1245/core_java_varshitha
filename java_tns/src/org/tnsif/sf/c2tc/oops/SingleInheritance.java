package org.tnsif.sf.c2tc.oops;


class Course{
	String coursenmae="Java programming";
	void showCourse() {
		System.out.println("Course : " + coursenmae);
	}
}
class Student extends Course{
	String name="Amit";
	
	void showStudent() {
		System.out.println("Student "+ name);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.showStudent();
		s.showCourse();
	}

}
