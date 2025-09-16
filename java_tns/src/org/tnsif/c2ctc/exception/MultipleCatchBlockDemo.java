package org.tnsif.c2ctc.exception;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		int numbers[]=new int[4];
		try {
			numbers[9]=50/0;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException  "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
		}catch(Exception e) {
			System.out.println("an unexcepted exception "+e.getMessage());
		}
		

	}

}
