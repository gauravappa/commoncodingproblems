package com.coding.practice.problems;

public class CountDigitInNumber {

	
	public int countDigitIterative(int number) {
		
		int result = 0 ;
		
			if(number==0) {
				result++;
			}
		
			while(number!=0) {
				number=number/10;
				result++;
			}
		
		return result;
	}
	
	public int countDigitRecursive(int number,boolean isRecursive) {
		
		if(number==0)
		{	if(isRecursive)
			return 0;
			else
			return 1;
		}
		
		return 1+countDigitRecursive(number/10,true);
		
	}
}
