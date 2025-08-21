package org.tnsif.c2ctc.scanner;
import java.util.Scanner;
public class Scannerexample {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=i.nextLine(); //validate
		System.out.println(name);
		System.out.println("enter your age:");
		int age=i.nextInt();
		System.out.println(age);
		i.close();
	}

}
