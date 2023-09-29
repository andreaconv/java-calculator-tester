package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calcolo;
	
	int num1 = 10;
	int num2 = 5;
	
	@BeforeEach
	public void beforeEach() {

		try {
			calcolo = new Calculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test addizione")	
	public void calcAdd() {
		
		float operazione = 0;
		
		try {
			operazione = calcolo.add(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//LA SOMMA DEV'ESSERE 15
		assertEquals(15, operazione);
	}
	
	
	@Test
	@DisplayName("Test sottrazione")	
	public void calcSub() {
		
		float operazione = 0;
		
		try {
			operazione = calcolo.subtract(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//LA DIFFERENZA DEV'ESSERE 5
		assertEquals(5, operazione);
	}
	
	
	@Test
	@DisplayName("Test moltiplicazione")	
	public void calcMul() {
		
		float operazione = 0;
		
		try {
			operazione = calcolo.multiply(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//LA MOLTIPLICAZIONE DEV'ESSERE 50
		assertEquals(50, operazione);
	}
	
	
	@Test
	@DisplayName("Test divisione")	
	public void calcDiv() {
		
		float operazione = 0;
		
		try {
			operazione = calcolo.divide(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//LA DIVISIONE DEV'ESSERE 2
		assertEquals(2, operazione);
	}
	
	
	@Test
	@DisplayName("Test divisione per 0")
	public void testDivideByZero() {
		
		assertThrows(Exception.class,
		//LAMBDA EXPRESSION
			() -> calcolo.divide(num1, 0),
			"Dividere per 0 deve generare un'eccezione");
	}

}
