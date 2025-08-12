package org.tnsif.sf.c2tc.oops;
class Animal{
	void ownstyle() {
		System.out.println("animal have own style");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog own style is barking");
	}
}
class Puppy extends Dog{
	void learnbark() {
		System.out.println("puppy learn barking from dog");
	}
}
 
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy();
		p.ownstyle();
		p.bark();
		p.learnbark();
	}

}
