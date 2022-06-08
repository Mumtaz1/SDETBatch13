package com.syntax.reviewClass3;

public class IfElse6 {

	public static void main(String[] args) {

	String country = "Albania", capital = "";
		
		switch(country) {
		
		case "Turkey":
			capital = "Ankara";
			break;
		case "USA": 
			capital = "DC";
			break;
		case "Serbia":
			capital = "Belgrade";
			break;
		case "Albania": 
			capital = "Tirana";
			break;
		case "Afghanistan":
			capital = "Kabul";
			break;
		case "Pakistan":
			capital = "Islamabad";
			break;
		default:
			capital = "Either country name is included correct or its not a country";
		}
			System.out.println(capital);  // got local variable may have not been initialized.
			// to fix it change line 7 to capital = null; or add a default statement after line 27/ and add a SOPln
		}
	}