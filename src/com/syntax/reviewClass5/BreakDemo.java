package com.syntax.reviewClass5;

public class BreakDemo {

	public static void main(String[] args) {
		
		// This yields the same results as BreakDemo2
		
		for (int i = 0; i < 5; i ++) {
			
			if (i > 2) {
				break;
			}
			System.out.println("Zameer the Break Manager");  //prints 3 times
		}
		System.out.println("We are done looping");  //outputs 1 time
	}
}