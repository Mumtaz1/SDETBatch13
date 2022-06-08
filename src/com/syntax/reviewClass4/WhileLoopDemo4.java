package com.syntax.reviewClass4;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		
		/*
		 *  Take the input from the user using Scanner
		 *  Increment it by 2 print it
		 *  if value is 10 terminate the program
		 */
		
		int num = 0;  	// starting point
		Scanner input = new Scanner(System.in);	//Create a Scanner object
		
		while (num != 10) {
			System.out.println("Please enter a number");	
			num = input.nextInt();  	
			System.out.println(num + 2);
		}
		input.close();
	}
}