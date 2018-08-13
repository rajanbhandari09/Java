package com.problems.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestDifference {

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
		computeSmallestDifference(arr1,arr2);
		sc.close();
	}

	private static void computeSmallestDifference(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0;
		int j=0;
		int smallestDifference = Integer.MAX_VALUE;
		while(i < arr1.length && j < arr2.length){
			int difference = Math.abs(arr1[i]-arr2[j]);
			if(smallestDifference > difference)
				smallestDifference = difference;
			if(arr1[i] == arr2[j])
				break;
			else if(arr1[i] < arr2[j])
				++i;
			else
				++j;
		}
		System.out.println("Smallest Difference: "+smallestDifference);
	}
}
