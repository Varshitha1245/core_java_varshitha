package org.tnsif.c2ctc.exception;

public class Throwexample {

	public static void main(String[] args) {
		int age = 25;
		if(age>18){
			throw new ArithmeticException("you are eligible");// TODO Auto-generated method stub
		}
		else {
			System.out.println("not eligible");
		}

	}

}
