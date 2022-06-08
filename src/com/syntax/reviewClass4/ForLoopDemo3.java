package com.syntax.reviewClass4;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		
		// this is the same as WhileLoopDemo3
		
		/*
		 * Step 1: int y = 9
		 * Step 2: y >= 1
		 * Step 3: print statement
		 * Step 4: y - 2
		 * Step 5: y >= 1
		 * Step 6: print statement
		 * Step 7: y - 2 etc
		 */
		
		for(int y = 9; y >= 1; y = y-2) {
			System.out.println(y);	//9 7 5 3 1
		}
	}
}