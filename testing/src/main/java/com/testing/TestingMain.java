package com.testing;

import com.testing.calculator.Calculator;

public class TestingMain {
	
	public static void main(String[] args) {
		System.out.println("Test modułu.");
		
		/*
			TEST KALKULATORA
		 */
		
		Calculator calc = new Calculator();
		int addresult = calc.add(180, 19);
		int subresult = calc.substract(200, 150);
		int divresult = calc.division(50 , 5);
		int multiplicationresult = calc.multiplication(5, 3);
		int expresult = calc.exp(5);
		
		/*
			TEST DODAWANIE I ODEJMOWANIA
		 */
		System.out.print("TEST DODAWANIA I ODEJMOWANIA:");
		if (addresult == 199 && subresult == 50) {
			System.out.println(" OK !");
		} else {
			System.out.println(" ERROR!");
		}
		
		/*
			TEST DZIELENIA , MNOZENIA, POTEGOWANIA
		 */
		
		//EXPECTED RESULT 10
		System.out.print("TEST DZIELENIA (SPODZIEWANE 10): " + divresult);
		if (divresult == 10) {
			System.out.println(" OK !");
		} else {
			System.out.println(" ERROR !");
		}
		
		// EXPECTED RESULT 20
		System.out.print("TEST MNOZENIA (SPODZIEWANE 20): " + multiplicationresult);
		if (multiplicationresult == 20) {
			System.out.println(" OK !");
		} else {
			System.out.println(" ERROR !");
		}
		
		 //EXPECTED RESULT 25
		System.out.print("TEST POTEGOWANIA (SPODZIEWANE 25): " + expresult);
		if (expresult == 25) {
			System.out.println(" OK !");
		} else {
			System.out.println(" ERROR !");
		}
		
	}
}
