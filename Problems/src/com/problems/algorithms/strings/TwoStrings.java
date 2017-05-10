package com.problems.algorithms.strings;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testcases = sc.nextInt();
	for(int i=0;i<testcases;i++){
		String input1 = sc.next();
		String input2 = sc.next();
		String result;
		result = checkIfSubstring(input1,input2);
		System.out.println(result);
		
	}

	}

	private static String checkIfSubstring(String input1, String input2) {
		String result ="NO";
		boolean[] table1 = new boolean[26];
		boolean[] table2 = new boolean[26];
		
		char[] chararray1 = input1.toCharArray();
		char[] chararray2 = input2.toCharArray();
		
		for(char c: chararray1){
			table1[c-97]=true;
		}
		for(char c: chararray2){
			table2[c-97]=true;
		}
		for(int i=0;i<26;i++){
			if(table1[i]==true&&table2[i]==true){
				result = "YES";
				break;
			}
			
		}
		return result;
	}

}
