package com.coding.practice.problems;

public class PalindromeNumber {


	public boolean isPalindromeNumber(int number) {
		boolean result=false;
		
		int tempNumber=number;
		
		int revNumber=0;
		
		while(tempNumber>0) {
			revNumber=revNumber*10+tempNumber%10;
			tempNumber = tempNumber/10;
		}
		
		if(number==revNumber)
			result=true;
		
		return result;
	} 
	
	
	
	
	
}
