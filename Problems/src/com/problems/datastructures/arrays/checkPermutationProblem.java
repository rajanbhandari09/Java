package com.problems.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class checkPermutationProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString1 = input.next();
		String inputString2 = input.next();
		System.out.println("Are 2 strings permutations of each other? "+isPermutation(inputString1,inputString2));
		input.close();
	}

	private static boolean isPermutation(String inputString1, String inputString2) {
		if(inputString1.length()!=inputString2.length())
			return false;		
		return sort(inputString1).equals(sort(inputString2));			
		
	}

	private static String sort(String inputString) {
		char[] stringChars = inputString.toCharArray();
		Arrays.sort(stringChars);
		return new String(stringChars);
	}

}
