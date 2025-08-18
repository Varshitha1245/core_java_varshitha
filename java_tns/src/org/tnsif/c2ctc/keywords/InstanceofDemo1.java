package org.tnsif.c2ctc.keywords;
class Person5{
	
}
class Employee extends Person5{
	
}
class Manager extends Employee{
	
}
public class InstanceofDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person5 p5 = new Person5();
		Employee emp = new Employee();
		Manager m = new Manager();
		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Person5);
		System.out.println(emp instanceof Manager);
		System.out.println(m instanceof Manager);
		System.out.println(m instanceof Employee);
		System.out.println(m instanceof Person5);
		System.out.println(p5 instanceof Employee);
		System.out.println(p5 instanceof Manager);
	}

}
