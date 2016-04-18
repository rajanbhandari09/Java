package com.problems.algorithms;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases!=0){
			String input = sc.next();
			String output = checkPalindromeIndex(input);
			System.out.println(output);
			
		}

	}
	public static String checkPalindromeIndex(String input){
		String result = null;
		StringBuilder sb = new StringBuilder(input);
		StringBuilder reverse = new StringBuilder(sb.reverse());
		if(input.length()==1)
			return null;
		if(sb.equals(reverse))
			return null;
		
		else if(checkPalindromeIndex(input.substring(1,input.length()))==null){
			result = input.substring(0, 1);
		}
		else if(checkPalindromeIndex(input.substring(0,input.length()-1))==null){
			result = input.substring(0, 1);
		}
		
		return result;
		}
		
		
		
	
	
	
}
