package com.syntax.reviewClass5;

public class ContinueDemo {

	public static void main(String[] args) {

		// This is the same results as ContinueDemo2 program
		for (int i = 0; i < 5; i++) {

			System.out.println("Batch 13 is great");
			if (i > 2) {
				continue;
			}
			System.out.println("Batch 13 is excellent");
		}
	}
}