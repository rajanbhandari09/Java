package com.problems.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerPairsWithSumK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter array values");
		for(int i=0;i<length;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter sum");
		int checkSum = sc.nextInt();
		printPairsWithGivenSum(arr,checkSum);
		sc.close();
	}

	//Solution 3: Sorting Array
	private static void printPairsWithGivenSum(int[] arr, int checkSum) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		while(i < j){
			if(arr[i] + arr[j] == checkSum){
				System.out.println("Pair: "+arr[i]+" "+arr[j]);
				++i;
				--j;
			}
			else if(arr[i] + arr[j] > checkSum)
				--j;
			else if(arr[i] + arr[j] < checkSum)
				++i;
		}
	}

	//Solution 2: Using HashMap
	//	private static void printPairsWithGivenSum(int[] arr, int checkSum) {
	//		Map<Integer,Integer> numberInstancesMap = new HashMap<>();
	//		for(int number1: arr){
	//			int number2 = checkSum-number1;
	//			if(numberInstancesMap.containsKey(number2) && numberInstancesMap.get(number2) > 0){
	//				System.out.println("Pair: "+number1+" "+number2);
	//				numberInstancesMap.put(number2, numberInstancesMap.get(number2)-1);
	//			}
	//			else{
	//				if(numberInstancesMap.containsKey(number1))
	//					numberInstancesMap.put(number1,numberInstancesMap.get(number1)+1 );
	//				else
	//					numberInstancesMap.put(number1,1);
	//			}
	//		}
	//	}

	//Solution 1: Brute Force
	//	private static void printPairsWithGivenSum(int[] arr, int checkSum) {
	//		for(int i=0;i<arr.length-1;++i){
	//			for(int j=i+1;j<arr.length;++j)
	//				if(arr[i]+arr[j] == checkSum)
	//					System.out.println("Pair: "+arr[i]+" "+arr[j]);
	//		}
	//	}

}
