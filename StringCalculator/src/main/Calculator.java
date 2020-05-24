package main;

public class Calculator {

	public Integer calculate(String input) {
		String[] numbers=input.split(",|\n");
		if(numbers[0]=="") {
			return 0;
		}
		else if(numbers.length==1)
		{
			return(stringToInt(numbers[0]));
		}

		return 0;
	}

	private Integer stringToInt(String string) {
		return(Integer.parseInt(string));
	}

}
