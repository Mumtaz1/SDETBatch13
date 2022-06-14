package com.syntax.reviewClass6;

public class Student {

	// Can't run this because no Main method defined.
	// This is just a template
	
	/*
	 * Define attributes / fields = variables
	 */
	String name, lastName, address;
	int studentId, age;
	char grade;
	
	/*
	 * Define a behavior = methods
	 */
	void study() {
		System.out.println(name + " is studying");
	}
	void doHomework() {
		System.out.println(name + " is doing homework");
	}
	
	/*
	 * Create a method that will return full name of a 
	 * student in upper case.
	 */
	String getFullName() {
		return name.toUpperCase() + " " + lastName.toUpperCase();
	}
	
	/*
	 * Create a method to print full information
	 * of a student e.g., full name + age + id 
	 * + address
	 */
	void printInfo() {
		System.out.println(name + " " + lastName + " " + " is " + age 
				+ " and lives in " + address);
	}
	
	/*
	 * Create a method that will return whether 
	 * student is great, good, bad, or average 
	 * based on the grade.
	 */
	String rating() {
		switch(grade) {
		case 'A': 
			return "great";
		case 'B':
			return "good";
		case 'C':
			return "average";
		default:
			return "bad";
		}	
	}
	void takeSubject(String subject) {
		System.out.println(name + " studies " + subject);
	}
	
	
}