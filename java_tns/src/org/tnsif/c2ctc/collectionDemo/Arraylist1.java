package org.tnsif.c2ctc.collectionDemo;
import java.util.ArrayList;
import java.util.List;
public class Arraylist1 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("Dragon fruit");
		System.out.println("First Fruit : firts.get(0))");
		fruits.set(2,  "cherry");
		if(fruits.contains("apple"));
		{
			System.out.println("Apple is in the list");
		}
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		fruits.remove(2);
		fruits.clear();
		System.out.println("list cleared no of fruits :"+fruits.size());
		System.out.println(fruits);
	}

}
