package org.tnsif.c2ctc.genericsDemo;

class DataContainer<T>
{
	private T  data;

public DataContainer(T data) {
	this.data=data;
}
public T getData()
{
	return data;
}
public void displayData() {
	System.out.println("data types "+data.getClass().getSimpleName());
	System.out.println("data value "+data);
}
}


public class GenericClass {

	public static void main(String[] args) {
		DataContainer<Integer> integerContainer=new DataContainer<>(123);
		integerContainer.displayData();
		DataContainer<String> integerContainer1=new DataContainer<>("java generics");
		integerContainer1.displayData();
		DataContainer<Double> integerContainer2=new DataContainer<>(11.324);
		integerContainer.displayData();
		

	}

}
