package com.syntax.reviewClass2;

public class StringConCat {

	public static void main(String[] args) {
		
		String firstName = "Ali";
		String lastName = "Baba";
		String fullName = firstName + lastName;
		int num = 10;
		int num2 = 10;
		System.out.println(fullName);
		System.out.println(firstName + num);
		System.out.println(firstName + num + num2); //Ali1010 because 1st operation firstName + num > Alli10
		// Then Ali10 is a string, and we add num2 to the string. So Ali10 + 10 outputs Ali1010.
		System.out.println(firstName + (num+num2)); //Ali20 because 1st operation is num1 + num2 = 20. 
		// Then concat firstName.
		System.out.println(num + firstName + num2); //10Ali10
		
	}
}
