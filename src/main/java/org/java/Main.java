package org.java;

import org.java.calculator.Calculator;

public class Main {
	
	public static void main(String[] args) {

		Calculator calcolo = new Calculator();
		
		int num1 = 5;
		int num2 = 9;

		//ADDIZIONE
		System.out.println("Prova addizione: " + calcolo.add(num1, num2));
		
		//SOTTRAZIONE
		System.out.println("Prova sottrazione: " + calcolo.subtract(num1, num2));

		//MOLTIPLICAZIONE
		System.out.println("Prova moltiplicazione: " + calcolo.multiply(num1, num2));
		
		//DIVISIONE
		try {
			System.out.println("Prova divisioine: " + calcolo.divide(num1, 0));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Prova divisioine: " + calcolo.divide(num1, num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
