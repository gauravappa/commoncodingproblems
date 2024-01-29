package com.coding.practice.problems;

public class Factorial {

	public int calculateFactorialOfNumber(int number) {
		
		
		if(number==1||number==0)
			return 1;
		
		
		return number* calculateFactorialOfNumber(number-1);
	}
	
}

class NegativeNumberFactorialNotPossibleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
