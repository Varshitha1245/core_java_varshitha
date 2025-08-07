package org.tnsif.sf.c2tc.oops;

public class Fooditem {
	//properties or state
	
	String name;
	double price;
	String category;
	
	//behavior
	void displayDetails()
	{
		System.out.println("Food Name "+name);
		System.out.println("Food price "+price);
		System.out.println("Food category "+category);
		System.out.println("-------------");
		
	}
	public static void main(String[] args) {
		Fooditem obj=new Fooditem();
		obj.name="burger";
		obj.price=50.6;
		obj.category="fast food";
		
		Fooditem obj1=new Fooditem();
		obj1.name="paneer pizza";
		obj1.price=239.7;
		obj1.category="italian";
		
		obj.displayDetails();
		obj1.displayDetails();
	}

}
