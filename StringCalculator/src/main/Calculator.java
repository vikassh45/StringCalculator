package main;

public class Calculator {

	public Integer calculate(String input) {
		String[] numbers=input.split(",|\n");
		if(numbers[0]=="") {
			return 0;
		}
		else if(numbers.length==1)
		{
			return(Integer.parseInt(numbers[0]));
		}
		return 0;
	}

}
