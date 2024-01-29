package com.coding.practice.problems;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		//int arr[] = {1,4,32,54,3,1,32};
		
		int arr[] = {32,32,32,3,32,32,32};
		
		int index=getSecondLargestElementIndex(arr);
		System.out.println("Index of second highest element is = "+index+" that is "+(index>=0?arr[index]+"":" second highest does not exists"));
		
	}

	private static  int getSecondLargestElementIndex(int[] arr) {
		if(arr.length<2)
			return -1;
		
		int largestElementIndex = 0;
		int secondLargestElementIndex=-1;
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[largestElementIndex]>arr[i]) {
				
			if(secondLargestElementIndex==-1 || arr[secondLargestElementIndex]<arr[i]) {
					secondLargestElementIndex=i;
				}
			}else if(arr[largestElementIndex]<arr[i]) {
				secondLargestElementIndex=largestElementIndex;
				largestElementIndex=i;
				
			}
			
		
		}
		return  secondLargestElementIndex;
	}
	
	
}
