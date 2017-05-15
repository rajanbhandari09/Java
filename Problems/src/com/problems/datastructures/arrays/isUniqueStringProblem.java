package com.problems.datastructures.arrays;


import java.util.Scanner;

//Given a string determine if it contains all unique characters

public class isUniqueStringProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		System.out.println("Is string unique?: "+isUnique(inputString));
		input.close();
	}

	private static boolean isUnique(String inputString) {
		if(inputString.length()>128)
			return false;
		else{
			boolean[] containsChar = new boolean[128];
			for(int i=0;i<inputString.length();i++){
				if(containsChar[inputString.charAt(i)])
					return false;
				else
					containsChar[inputString.charAt(i)]=true;
			}
			return true;
		}
		
	}



}
