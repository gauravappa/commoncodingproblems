package com.coding.practice.problems;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		//int arr[] = {1,4,32,54,3,1,32};
		
		//int arr[] = {32,32,3,32,32,32,32};
		
		//int arr[] = {1,3,5,7,9,11,13};
		//int arr[] = {13,11,9,7,5,3,1};
		int arr[] = {78,78,78,76,76,76,76};
		boolean result=isArraySorted(arr);
		System.out.println("is array sorted = "+result);
		
	}

	private static  boolean isArraySorted(int[] arr) {
		boolean result = false;
		String order="";
		if(arr.length<=1) {
			return true;
		}
		int previousElementIndex=0;
			for(int i = 1;i<arr.length;i++) {
				
				if(order.equals("ASC")) {
					if(arr[previousElementIndex]>arr[i]) {
						return false;
				}}else if(order.equals("DESC")) {
					if(arr[previousElementIndex]<arr[i])
						return false;
				}else {
					if(arr[previousElementIndex]<arr[i]) {
						order="ASC";
					}else if(arr[previousElementIndex]>arr[i]) {
						order="DESC";
					}
				}
					previousElementIndex=i;
			
				}
			if(previousElementIndex==arr.length-1) {
				result=true;	
			}
		
	    return result;
	}
	
}
