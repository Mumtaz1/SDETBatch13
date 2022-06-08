package com.syntax.reviewClass1;

import java.math.BigInteger;

public class Variables {

	public static void main(String[] args) {
		
		String a = "10";
		String b = "20";
		System.out.println(a+b);
		
		// Boxes to store number without decimal places
		byte smallestBox = 127; //-128 to 127
		short slightlyLargerBox = 16665; //-32,768 to 32,767
		int famousBox = 21455555; //-2,147,483,648 to 2,147,483,647
		long notThatFamousBox = 4545454545454L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float  f = 12.555555522555222222f; //6 to 7 decimal digits
		double d = 12.5555522555522277777; //stores 14 to 15 decimal places of accuracy
		System.out.println(f);  // Outputs: 12.555555
		System.out.println(d); // Outputs: 12.555552255552227
		
		// Note we needed to import math.BigInteger for the next line:
		BigInteger i = new BigInteger("11252222222222222222222222222222222222222222222222222222222222222222"); 
		System.out.println(i); // Outputs: 11252222222222222222222222222222222222222222222222222222222222222222
				
		float f1 = 10.0f / 3.0f;
		double d1 = 10.0 / 3.0;
		System.out.println(f1); // Outputs 3.3333333
		System.out.println(d1); // Outputs 3.3333333333333335
		
		// always for whole numbers use int data type and for decimal mumbers use double data type
		
		char letter = 'a';  //single character/letter or ASCII value
		System.out.println(letter);
		String name = "Naveed";
		String address = "house  # 5, Flat # 3, street 121 ";
		
		//System.out.println( '\uD83D\uDE40');
		boolean areYouHungry = true; //true or false
	}

}
