package com.problems.algorithms.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int testcases = sc.nextInt();
while(testcases!=0){
	String input = sc.next();
	String output = checkFunny(input);
	System.out.println(output);
	testcases--;
}
	}
public static String checkFunny(String input){
	char[] arr1 = input.toCharArray();
	StringBuilder sb = new StringBuilder(input);
	char[] arr2 = sb.reverse().toString().toCharArray();
	for(int i=1;i<input.length();i++){
		if(Math.abs(arr1[i]-arr1[i-1])!=Math.abs(arr2[i]-arr2[i-1])){
			return "Not Funny";
			
		}
		
	}
	return "Funny";
	
}
	
	
}
