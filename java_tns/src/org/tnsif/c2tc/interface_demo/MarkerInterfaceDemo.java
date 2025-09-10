package org.tnsif.c2tc.interface_demo;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable s = new Student(1012,"priya",1200,"java");
		Registerable s1 = new Student(1030,"anu",1300,"java");// TODO Auto-generated method stub
		Object obj = new Object();
		if(s instanceof Registerable) {
			System.out.println("student is registered for this course");
			
		}
		else {
			System.out.println("student is not registered for this course");
		}
	}

}
