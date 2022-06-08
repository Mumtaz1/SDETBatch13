package com.syntax.reviewClass3;

public class IfElse5 {

	public static void main(String[] args) {
		
		// When multiple if else if conditions result in same output then we can replace
		// if else if condition with logical || operator.
		
		//if all conditions produce different output then we cannot use logical operator.
		
		String country = "Pakistan";
		
		if("Turkey".equals(country)) {
			System.out.println("Ankara");
		} else if ("USA".equals(country)) {
			System.out.println("DC");
		} else if ("Serbia".equals(country)) {
			System.out.println("Begrade");
		} else if ("Albania".equals(country)) {
			System.out.println("Tirana");
		} else if ("Afghanistan".equals(country)) {
			System.out.println("Islamabad");
		}
	}
}