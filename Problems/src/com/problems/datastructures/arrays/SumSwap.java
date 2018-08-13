package com.problems.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumSwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array 1 length");
		int length1 = sc.nextInt();
		System.out.println("Enter array 2 length");
		int length2 = sc.nextInt();
		int[] arr1 = new int[length1];
		int[] arr2 = new int[length2];
		System.out.println("Enter array 1 elements");
		for(int i=0;i<length1;++i)
			arr1[i] = sc.nextInt();
		System.out.println("Enter array 2 elements");
		for(int i=0;i<length2;++i)
			arr2[i] = sc.nextInt();
		int sum1 = calculateSum(arr1);
		int sum2 = calculateSum(arr2);
		findPairOfValuesForSwap(arr1,arr2,sum1,sum2);
		sc.close();
	}

	private static int calculateSum(int[] arr) {
		int sum = 0;
		for(int number: arr)
			sum += number;
		return sum;
	}

	private static void findPairOfValuesForSwap(int[] arr1, int[] arr2, int sum1, int sum2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int target = sum1-sum2;
		while(i<arr1.length && j<arr2.length){
			int eq = 2*arr1[i] - 2*arr2[j];
			if(eq == target){
				System.out.println("Pair: "+arr1[i]+" "+arr2[j]);
				return;
			}
			else if(eq < target)
				++i;
			else if(eq > target)
				++j;
		}
		System.out.println("No pairs");
	}
}
