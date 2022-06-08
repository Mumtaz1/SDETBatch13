package com.syntax.reviewClass5;

public class BreakManager {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 5) {
			if (i > 2) {
				break;   // if u use continue here u will get infinite loop b/c it never gets to line 13
			}
			System.out.println("Zameer is fired");  //3 times
			i++;
		}
		System.out.println("We are done looping");   // 1 time
	}

}
