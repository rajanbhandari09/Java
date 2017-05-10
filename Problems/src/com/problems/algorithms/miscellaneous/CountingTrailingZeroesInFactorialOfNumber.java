package com.problems.algorithms.miscellaneous;

import java.util.Scanner;

public class CountingTrailingZeroesInFactorialOfNumber {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = inputs.nextInt();
		System.out.println(CountTrailingZeroesInFactorial(number));
		inputs.close();
	}

	private static int CountTrailingZeroesInFactorial(int number) {
		int countTrailingZeroes = 0;
		for(int i=5;i<=number;i=i*5){			
			countTrailingZeroes += number/i;			
		}
		return countTrailingZeroes;
	}

}
