package org.tnsif.sf.c2tc.oops;


class Employee{
	void company() {
		System.out.println("Company: TNSIF");
	}
}
class Developer extends Employee{
	void role() {
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee{
	void role() {
		System.out.println("Role : QA Tester");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t = new Tester();
		Developer d = new Developer();
		
		d.company();
		d.role();
		
		t.company();
		t.role();
	}

}
