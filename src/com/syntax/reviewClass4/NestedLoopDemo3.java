package com.syntax.reviewClass4;

public class NestedLoopDemo3 {

	public static void main(String[] args) {
		
		int c = 1; 
		while(c <= 2) {
			System.out.println(c);
			c ++;
		}
		// the below will not run because c = 3 by the time it gets here.
		//However, if you type c = 1; b4 line 14 then it will print twice 1 2 1 2
		c = 1;
		while(c <= 2) {
			System.out.println(c);
			c ++;
		}
		c = 1;
		while(c <= 2) {
			System.out.println(c);
			c ++;
		}
	}
}