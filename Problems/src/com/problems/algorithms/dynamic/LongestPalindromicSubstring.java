package com.problems.algorithms.dynamic;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static String LongestPalindromeSubString(String input){
		
		int stringLength = input.length();
		boolean[][] palindromeMap = new boolean[stringLength][stringLength];
		int maxLength = 0;
		String result = null;
		//All substrings of length = 1 are palindromes
		for(int i=0;i<stringLength;i++){
			palindromeMap[i][i]=true;
		}
		
		//Checking substrings of length = 2 for palindromes
		for(int i=0;i<stringLength-1;i++){
			if(input.charAt(i)==input.charAt(i+1)){
				palindromeMap[i][i+1] = true;
				maxLength = 2;
				result = input.substring(i,i+2);
			}
		}
		for(int k=2;k<stringLength;k++){
			for(int i=0;i+k<stringLength;i++){
			if(palindromeMap[i+1][i+k-1]&&input.charAt(i)==input.charAt(i+k)){
				palindromeMap[i][i+k]=true;
				if(input.substring(i,i+k+1).length()>maxLength){
					maxLength = input.substring(i,i+k+1).length();
					result = input.substring(i,i+k+1);
				
				}
			}
			}
		
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString = input.next();
		System.out.println(LongestPalindromeSubString(inputString));
		input.close();

	}

}
