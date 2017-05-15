package com.problems.datastructures.arrays;
//Given a string, check if it is a permutation of a palindrome
import java.util.Scanner;

public class PalindromePermutationProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println("Is given string permutation of palindrome string: "+isPalindromePermutation(inputString));
		

	}

	private static boolean isPalindromePermutation(String inputString) {
		int[] charCounts = getCharacterCountsInString(inputString);
		
		int oddCharacterCounts = 0;
		for(int count: charCounts){
			if(count%2!=0){
				if(oddCharacterCounts>0)
					return false;
				oddCharacterCounts++;
			}
		}
		return true;
	}

	private static int[] getCharacterCountsInString(String inputString) {
		int[] charCounts = new int[26];
		//calculating character counts (only alphabets) in the string, ignoring upper and lower case
				for(int i=0;i<inputString.length();i++){
					if(inputString.charAt(i)>64&&inputString.charAt(i)<91)
					charCounts[inputString.charAt(i)-'A']++;
					else if(inputString.charAt(i)>96&&inputString.charAt(i)<123)
					charCounts[inputString.charAt(i)-'a']++;
				}
		return charCounts;
	}

}
