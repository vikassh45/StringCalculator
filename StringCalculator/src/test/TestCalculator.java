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
	@Test
	void twoValuesReturnsSumWithComma() throws Exception
	{
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("5,6"),11);
	}
	@Test
	void twoValuesReturnsSumWithNewLine() throws Exception
	{
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("5\n6"),11);
	}
	
}
