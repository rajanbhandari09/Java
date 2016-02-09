package com.problems.javafundamentals;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases!=0){
			String input = sc.next();
			int deletions = makeAlternating(input);
			System.out.println(deletions);
			testcases--;
		}

	}

	public static int makeAlternating(String input){
		
		StringBuilder sb = new StringBuilder(input);
		int count =0;
		for(int i=1;i<sb.length();i++){
			if(sb.charAt(i-1)==sb.charAt(i)&&sb.length()!=1){
					sb.deleteCharAt(i);
					i=i-1;
					count++;
			}
		}
		return count;
		
	}
	
	
	
	
}
