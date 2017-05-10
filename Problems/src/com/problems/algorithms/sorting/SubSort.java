package com.problems.algorithms.sorting;

import java.util.Scanner;

public class SubSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter numbers separated by space");
		for(int i=0;i<size;i++){
			numbers[i] = input.nextInt();
		}
		
		int increasingLeftSubArrayEnd = increasingSubArrayIndex(numbers);
		int decreasingRightSubArrayStart = decreasingSubArrayIndex(numbers);
		
		int minValBetweenMiddleAndRightSubArray = findMinValueBetweenArrayIndices(numbers,increasingLeftSubArrayEnd+1,numbers.length);
		int maxValBetweenLeftAndMiddleSubArray = findMaxValueBetweenArrayIndices(numbers,0,decreasingRightSubArrayStart);
		
		int subSortStartIndex = findIndexInIncreasingSubArray(numbers,increasingLeftSubArrayEnd,minValBetweenMiddleAndRightSubArray);
        int subSortEndIndex = findIndexInDecreasingSubArray(numbers, decreasingRightSubArrayStart, maxValBetweenLeftAndMiddleSubArray);
        System.out.println(subSortStartIndex+" "+subSortEndIndex);
	}

	public static int increasingSubArrayIndex(int[] numbers){
		for(int i=0;i<numbers.length-1;i++){
			if(numbers[i]>numbers[i+1])
				return i;
		}
		
		return -1;
	}
	
	public static int decreasingSubArrayIndex(int[] numbers){
		for(int i=numbers.length-1;i>0;i--){
			if(numbers[i]<numbers[i-1])
				return i;
		}
		return -1;
	}
	
	public static int findMinValueBetweenArrayIndices(int[] numbers, int startIndex, int EndIndex){
		int min = numbers[startIndex];
		for(int i=startIndex;i<EndIndex;i++){
			if(numbers[i]<min)
				min=numbers[i];
		}
		return min;
	}
	
	public static int findMaxValueBetweenArrayIndices(int[] numbers, int startIndex, int EndIndex){
		int max = numbers[startIndex];
		for(int i=startIndex;i<EndIndex;i++){
			if(numbers[i]>max)
				max=numbers[i];
		}
		return max;
	}
	
	public static int findIndexInIncreasingSubArray(int[] numbers, int leftSubArrayIndexEnd, int minNumberInMiddleAndRightSubArray){
		for(int i=leftSubArrayIndexEnd;i>-1;i--){
			if(numbers[i]<minNumberInMiddleAndRightSubArray)
				return i+1;
		}
		return -1;
	}
	
	public static int findIndexInDecreasingSubArray(int[] numbers, int rightSubArrayIndexStart, int maxNumberInLeftAndMiddleSubArray){
		for(int i=rightSubArrayIndexStart;i<numbers.length;i++){
			if(numbers[i]>maxNumberInLeftAndMiddleSubArray);
			return i+1;
		}
		return -1;
	}
	
}
