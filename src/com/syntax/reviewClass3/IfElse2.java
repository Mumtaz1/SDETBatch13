package com.syntax.reviewClass3;

public class IfElse2 {

	public static void main(String[] args) {

		// When code executes but does not produce expexted results we call these mistakes logical errors
		// when code does not even execute we call these mistakes syntax errors
		
		String day = "Monday"; //in non-primitve type variables we can store null which means nothing
		
		if (day.equals("Monday")) {
			System.out.println("weekday");
		} else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		} else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		} else if ("Thursday".equals(day)) {
			System.out.println("weekday");
		}  else if ("Friday".equals(day)) {
			System.out.println("weekday");
		}  else if ("Saturday".equals(day)) {
			System.out.println("weekday");
		}  else if ("Sunday".equals(day)) {
			System.out.println("weekday");
		}
		
		System.out.println("----------------");
		
		if (day.equals("Monday") || "Tuesday".equals(day) || "Wednesday".equals(day) 
				|| "Thursday".equals(day) || "Friday".equals(day)) {
		System.out.println("weekday");
		} else if (day.equals("Saturday") || "Sunday".equals(day)) {
			System.out.println("weekend");
		}
			
		
		
		// if we have to test multiple conditions we go with if else if conditions.
	}
}