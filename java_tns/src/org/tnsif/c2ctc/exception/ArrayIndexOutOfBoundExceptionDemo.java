package org.tnsif.c2ctc.exception;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        try {
            System.out.println("Trying to access 4th element: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling.");

	}

}
