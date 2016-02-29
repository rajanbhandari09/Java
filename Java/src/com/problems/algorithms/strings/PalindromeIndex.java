package com.problems.algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		for(int i=0;i<testcases;i++){
			int index =0;
			String input = sc.next();
			index = checkIndexForPalindrome(input);
			System.out.println(index);
		}
		
	}

	private static int checkIndexForPalindrome(String input) {
		char[] chararray = input.toCharArray();
	if(isPalindrome(input))
		return -1;
	else{
		
		int index =0;
for(int i=0;i<input.length();i++){
	
	if(chararray[i]!=chararray[input.length()-1-i]){
		if(deleteCharAndCheck(input,i)){
		index = i;
		break;
		}
		else{
			index = input.length()-1-i;
			break;
		}
	}
		
	
}
	
	return index;
	}
			
	}

	private static boolean deleteCharAndCheck(String input, int i) {
		StringBuilder sb = new StringBuilder(input);
		input = sb.deleteCharAt(i).toString();
		if(isPalindrome(input))
			return true;
		else
		return false;
	}

	private static boolean isPalindrome(String input) {
	
		StringBuilder sb = new StringBuilder(input);
		if(input.equals(sb.reverse().toString()))
			return true;
		else
		return false;
	}

	

	}
