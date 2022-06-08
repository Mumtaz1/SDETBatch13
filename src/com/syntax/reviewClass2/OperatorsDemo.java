package com.syntax.reviewClass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//Arithmetic Operators in Java + - / * %
		// Logical Operators == != >= <= > <
		// Relational and Equality Operator see Logical operators above. If something is = to then equality operator
		//   else relational operator
		
		int num = 10;
		int num2 = 10;
		System.out.println(num+num2);		 //20
		System.out.println(num >= num2); // true
		//Whole numbers 0 - infinity, and negative infinity to positive infinity.
		
		System.out.println(Long.MAX_VALUE); //Gives us the maximum range
		System.out.println(Long.MIN_VALUE); //Gives us the maximum range
		System.out.println(Byte.MAX_VALUE); //Gives us the maximum range for a Byte
		System.out.println(Integer.MAX_VALUE); //Gives us the maximum range for an int. Note Integer is spelled out
		System.out.println(num / num2); //1
		System.out.println(num % num2); // 0 
		
		System.out.println(10 / 3); // 3
		System.out.println(10 % 3); // 1
		
		System.out.println(10.0 / 3); // 3.3333333333333335 Note numbers after decimal point are called accuracy
		System.out.println((int)10.0 / 3);  // 3
		
		System.out.println((10.0 * 3)); // 30.0
		
		
	}
}