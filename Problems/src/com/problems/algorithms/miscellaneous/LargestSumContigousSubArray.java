package com.problems.algorithms.miscellaneous;

import java.util.Scanner;

public class LargestSumContigousSubArray {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = inputs.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter numbers separated by space");
		for(int i=0;i<size;i++){
			numbers[i]=inputs.nextInt();
		}
		System.out.println(LargestContigousSubArraySum(numbers));
	}
public static int LargestContigousSubArraySum(int[] numbers){
	int current_max = numbers[0];
	int overall_max = numbers[0];
	for(int i=1;i<numbers.length;i++){
		if(current_max+numbers[i]>numbers[i])
			current_max += numbers[i];
		else
			current_max = numbers[i];
		if(overall_max<current_max)
			overall_max = current_max;
	}
return overall_max;
}
}
