package org.tnsif.c2ctc.scanner;
import java.util.Scanner;
public class ScannerAllmethods {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s.nextLine(); 
		System.out.println("enter your age:");
		int age=s.nextInt();
		System.out.println("enter your height:");
		float height=s.nextFloat();
		System.out.println("are you a student:");
		boolean isstdent=s.nextBoolean();
		System.out.println("enter your adhar number:");
		long aadhar=s.nextLong();
		s.nextLine();
		System.out.println("enter your favorite teacher:");
		String teacher=s.nextLine();
		System.out.println("enter your hobby:");
		byte readingtime=s.nextByte();
		System.out.println("enter your CGPA:");
		double cgpa=s.nextDouble();
		System.out.println("enter no of siblings:");
		short siblings=s.nextShort();
		
		
	}

}
