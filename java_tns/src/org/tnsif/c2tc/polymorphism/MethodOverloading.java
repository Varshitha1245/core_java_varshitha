package org.tnsif.c2tc.polymorphism;

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	int add( int a, int b, int c) {
		return a+b+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("add(double, double)-> "+c.add(3.5,5.6));
		System.out.println("add(int,int,int)-> "+c.add(2,4,5));
		System.out.println("add(int ,int)-> "+c.add(2,1));
	}

}
