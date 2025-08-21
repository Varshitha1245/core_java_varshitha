package org.tnsif.c2ctc.scanner;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name:");
		char c = s.next().charAt(0);
		System.out.println(c);
		s.close();
	}

}
