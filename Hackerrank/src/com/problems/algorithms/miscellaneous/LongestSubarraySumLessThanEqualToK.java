package com.problems.algorithms.miscellaneous;

import java.util.Scanner;

public class LongestSubarraySumLessThanEqualToK {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter numbers of array separated by space");
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter number k");
		int k = sc.nextInt();
		System.out.println(LongestSubarray(numbers,k));
		sc.close();
	}

	private static int LongestSubarray(int[] numbers, int k) {
		int maxSubArrayLength = 0;
		int currentSubArrayStartIndex = 0;
		int currentSubArrayEndIndex = 0;
		int currentSubArrayLength = 0;
		int subArraySum = numbers[0];
		
		while(currentSubArrayStartIndex<numbers.length&&currentSubArrayEndIndex<numbers.length){
			
			
			if(subArraySum<=k){
				currentSubArrayEndIndex++;
				if(currentSubArrayEndIndex!=numbers.length)
				subArraySum += numbers[currentSubArrayEndIndex];
				currentSubArrayLength++;
			}
			
			else{
				
				currentSubArrayLength --;
				
				subArraySum -=numbers[currentSubArrayStartIndex];
				currentSubArrayStartIndex++;
				
			}
			if(maxSubArrayLength<currentSubArrayLength){
				maxSubArrayLength = currentSubArrayLength;
				//System.out.println(maxSubArrayLength);
			}
			
		}
		
		return maxSubArrayLength;
		
	}
	
}
