package com.problems.algorithms.strings;

import java.util.Scanner;

//Given a string e.g. aabcccccaaa, perform string compression using count of repeated characters

public class CompressStringProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString = input.next();
		System.out.println("Compressed String: "+compressedString(inputString));
		input.close();

	}

	private static String compressedString(String inputString) {
		StringBuilder compressedString = new StringBuilder();
		int consecutiveChars = 0;
		for(int i=0;i<inputString.length();i++){
			consecutiveChars++;
			if(i+1==inputString.length()||inputString.charAt(i)!=inputString.charAt(i+1)){
				compressedString.append(inputString.charAt(i));
				compressedString.append(consecutiveChars);
				consecutiveChars=0;				
			}
		}				
		return inputString.length()<=compressedString.length()?inputString:compressedString.toString();
	}

}
