package com.coding.practice.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class PalindromeNumberTest {

	PalindromeNumber palindromeNumber=null;
	
	@BeforeAll
	public void init() {
		palindromeNumber=new PalindromeNumber();
	}
	
	@Test
	public void zeroIsPallindrome() {
			
		assertEquals(true, palindromeNumber.isPalindromeNumber(0));
	}
	
	@Test
	public void singleDigitIsPallindrome() {
			
		assertEquals(true, palindromeNumber.isPalindromeNumber(2));
	}
	
	@Test
	public void doubleDigitNonPallindromeIsPallindrome() {
			
		assertEquals(false, palindromeNumber.isPalindromeNumber(12));
	}
	
	
	@Test
	public void doubleDigitPallindromeIsPallindrome() {
			
		assertEquals(true, palindromeNumber.isPalindromeNumber(44));
	}
	
	
	@Test
	public void pallindromeNumberIsPallindrome() {
			
		assertEquals(true, palindromeNumber.isPalindromeNumber(123321));
	}
	
	
	@Test
	public void nonPallindromeNumberIsPallindrome() {
			
		assertEquals(false, palindromeNumber.isPalindromeNumber(123123));
	}
	
	
	@Test
	public void nonPallindromeNumberIsPallindromeBig() {
			
		assertEquals(false, palindromeNumber.isPalindromeNumber(243536126));
	}
	
	
	@Test
	public void pallindromeNumberIsPallindromeBig() {
			
		assertEquals(true, palindromeNumber.isPalindromeNumber(1234554321));
	}
	
}
