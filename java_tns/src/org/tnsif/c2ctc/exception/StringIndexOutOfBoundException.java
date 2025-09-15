package org.tnsif.c2ctc.exception;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		String text = "Hello";

        System.out.println("String: " + text);
        try {
            System.out.println("Trying to access character at index 5: " + text.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
	}

}
