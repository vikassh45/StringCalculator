package main;

public class Calculator {

	public Integer calculate(String input) throws Exception {
		String[] numbers=input.split(",|\n");
		if(numbers[0]=="") {
			return 0;
		}
		else if(numbers.length==1)
		{
			return(stringToInt(numbers[0]));
		}
		else if(numbers.length==2)
		{
			return(getSum(numbers));
		}

		return 0;
	}

	private Integer getSum(String[] numbers) throws Exception {
		int sum=0;
		for(String s: numbers)
		{
			stringToInt(s);
			sum=sum+stringToInt(s);
			
		}
		return sum;
	}
	
	private Integer stringToInt(String string) {
		return(Integer.parseInt(string));
	}

}
