package org.tnsif.c2ctc.exception;

import java.io.IOException;

public class ThrowsExceptionDemo {
	void printing() {
		System.out.println("Printing java");
	}
	void scanning() throws IOException {
		System.out.println("Device errror");
	}
	void verification() throws ArithmeticException , IOException,ClassNotFoundException{
		System.out.println("technical error");
	}
	
	public static void main(String[] args) {
		ThrowsExceptionDemo e =new ThrowsExceptionDemo();
		e.printing();
		try {
			e.scanning();
		}catch(IOException r) {
			System.out.println(r);
		}
		
		try {
			e.verification();
		} catch(ArithmeticException e1)
		{
			System.out.println(e);
		}
		catch(IOException e1)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e1)
		{
			System.out.println(e);
		}
	
	}

}
