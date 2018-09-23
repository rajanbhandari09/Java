package com.problems.datastructures.arrays;

public class FindIndicesToSortArrayProblem {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 7, 10, 11, 8, 12, 5, 6, 16, 18, 19};
		findIndicesArray(arr);
	}
	public static void findIndicesArray(int[] arr){
		int leftArrayEndIndex = findLeftArrayEnd(arr);
		int rightArrayBeginIndex = findRightArrayBegin(arr);
		int min = findMinValueArray(leftArrayEndIndex+1,arr.length-1,arr);
		int max = findMaxValueArray(0,rightArrayBeginIndex-1,arr);
		while(leftArrayEndIndex >-1 && arr[leftArrayEndIndex] > min)
			--leftArrayEndIndex;
		while(rightArrayBeginIndex < arr.length-1 && arr[rightArrayBeginIndex] < max)
			++rightArrayBeginIndex;
		System.out.println("Indices" + (leftArrayEndIndex+1) +" "+(rightArrayBeginIndex-1));
	}
	private static int findMaxValueArray(int i, int j, int[] arr) {
		int max = arr[i];
		for(int k=i+1;k<=j;++k)
			if(max < arr[k])
				max = arr[k];
		return max;
	}
	private static int findMinValueArray(int i, int j, int[] arr) {
		int min = arr[i];
		for(int k=i+1;k<=j;++k)
			if(min > arr[k])
				min = arr[k];
		return min;
	}
	private static int findRightArrayBegin(int[] arr) {
		for(int i=arr.length-1;i>0;--i)
			if(arr[i] < arr[i-1] )
				return i;
		return -1;
	}
	private static int findLeftArrayEnd(int[] arr) {
		for(int i=0;i<arr.length-1;++i)
			if(arr[i] > arr[i+1] )
				return i;
		return -1;
	}
}
