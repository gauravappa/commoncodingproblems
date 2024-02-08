package com.coding.practice.problems;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	
	int arr[] = {2,3,4,5,6,7,76};
	
	System.out.println("input array = "+Arrays.toString(arr));
	reverseArray(arr);
	System.out.println("reverse array = "+Arrays.toString(arr));
}

	private static  void reverseArray(int[] arr) {
	int start=0;
	int end=arr.length-1;
	
	while(start<end) {
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
		
	
	}
}
