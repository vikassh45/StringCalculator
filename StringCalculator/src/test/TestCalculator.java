package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class TestCalculator {

	@Test
	void emptyStringReturnsZero() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate(""),0);
	}
	@Test
	void singleValueReturns() throws Exception
	{
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("5"),5);
	}

}
