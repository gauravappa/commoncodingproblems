package com.coding.practice.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CountDigitInNumberTests {

	@Test
	public void ifNumberPassedIsZeroIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(1, countDigitInNumber.countDigitIterative(0)); 
		
	}
	
	@Test
	public void ifNumberPassedIsSingleDigitIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(1, countDigitInNumber.countDigitIterative(4)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsTwoDigitIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(2, countDigitInNumber.countDigitIterative(56)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsNegativeTwoDigitNumberIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(2, countDigitInNumber.countDigitIterative(-56)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsFourDigitNumberIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(4, countDigitInNumber.countDigitIterative(1234)); 
		
	}
	
	@Test
	public void ifNumberPassedIsThreeDigitNumberWithZeroInBeginningIterative() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(3, countDigitInNumber.countDigitIterative(0234)); 
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void ifNumberPassedIsZeroRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(1, countDigitInNumber.countDigitRecursive(0,false)); 
		
	}
	
	@Test
	public void ifNumberPassedIsSingleDigitRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(1, countDigitInNumber.countDigitRecursive(4,false)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsTwoDigitRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(2, countDigitInNumber.countDigitRecursive(56,false)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsNegativeTwoDigitNumberRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(2, countDigitInNumber.countDigitRecursive(-56,false)); 
		
	}
	
	
	@Test
	public void ifNumberPassedIsFourDigitNumberRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(4, countDigitInNumber.countDigitRecursive(1234,false)); 
		
	}
	
	@Test
	public void ifNumberPassedIsThreeDigitNumberWithZeroInBeginningRecursive() {
		CountDigitInNumber countDigitInNumber = new CountDigitInNumber();
		assertEquals(3, countDigitInNumber.countDigitRecursive(0234,false)); 
		
	}
	
}
