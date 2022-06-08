package com.syntax.reviewClass3;

public class IfELse3 {

	public static void main(String[] args) {
		
		// the below way takes more CPU time to process. The above is a better way of writing the code.
		
		String day = "Monday"; 	
		
		if (day.equals("Monday")) {
			System.out.println("weekday");
		} 
		if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		} 
		if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		} 
		if ("Thursday".equals(day)) {
			System.out.println("weekday");
		} 
		if ("Friday".equals(day)) {
			System.out.println("weekday");
		} 
		if ("Saurday".equals(day)) {
			System.out.println("weekend");
		} 
		if ("Sunday".equals(day)) {
			System.out.println("weekend");
		} 
	}

}
