package com.syntax.reviewClass5;

public class ArraysDemo5 {

	public static void main(String[] args) {
		
		
		//enhanced for loop. note you cannot use enhanced loop to update arrays
		int [] arr = {1, 5, 8, 9};
		
		for (int number : arr) {  // so it takes 1 the first time and puts in number, 2nd time it takes 5, 3rd it takes 8 etc
			System.out.println(number);
			
		}
	}
}