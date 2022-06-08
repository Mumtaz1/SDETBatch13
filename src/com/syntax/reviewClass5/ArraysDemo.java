package com.syntax.reviewClass5;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// Should create an array
		String  name = "Oleg";
		String name2 = "King";
		String name3 = "Mumtaz";
		
		//Should not create an arrray
		String city = "New York";
		String country = "USA";
		String continent = "America";
		
		// Only used 5% of the times
		String[] names = {"Oleg", "King", "Mumtaz"};
		//String names[] = {"Oleg", "King", "Mumtaz"};  - can be written this way where [] is after variable name
		//The above is C++ . Line 17 is Java based.
		
		//95 % of the times you guys will use this approach
		String [] names2 = new String[3];  // Creates an empty array of size 3
		names2 [0] = "Oleg";
		names2 [1] = "King";
		names2 [2] = "Mumtaz";

		System.out.println(names[2]);
	}

}
