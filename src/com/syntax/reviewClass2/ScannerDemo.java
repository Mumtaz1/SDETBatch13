package com.syntax.reviewClass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Please Enter your age");
		int age = scanner.nextInt();	
		System.out.println(name + age);
		
		System.out.println(age + name + " where this will be printed"); // prints on one line: 21Mumtaz where this will be printed
	}
}