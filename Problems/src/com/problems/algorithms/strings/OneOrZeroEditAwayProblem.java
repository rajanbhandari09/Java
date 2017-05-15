package com.problems.algorithms.strings;

import java.util.Scanner;

public class OneOrZeroEditAwayProblem {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		String input1 = inputs.next();
		String input2 = inputs.next();
		System.out.println("Are 2 strings one or zero edit away?: "+checkZeroOrOneEdit(input1,input2));
		inputs.close();

	}

	private static boolean checkZeroOrOneEdit(String input1, String input2) {
		if(input1.length()==input2.length())
			return checkEditsForEqualLengthStrings(input1,input2);
		else if(input1.length()+1==input2.length())
			return checkEditsForDifferentLengthStrings(input2,input1);
		else if(input1.length()==input2.length()+1)
			return checkEditsForDifferentLengthStrings(input1,input2);
		
		return false;
	}

	private static boolean checkEditsForDifferentLengthStrings(String input1, String input2) {
		int indexString1 = 0;
		int indexString2 = 0;
		int countEdits = 0;
		while(indexString1<input1.length()&&indexString2<input2.length()){
			if(input1.charAt(indexString1)!=input2.charAt(indexString2)){
				countEdits++;
				if(countEdits>1)
					return false;
				indexString1++;
			}
			else{
				indexString1++;
				indexString2++;
			}
		}
		
		return true;
	}

	private static boolean checkEditsForEqualLengthStrings(String input1, String input2) {
		int indexString1 = 0;
		int indexString2 = 0;
		int countEdits = 0;
		while(indexString1<input1.length()&&indexString2<input2.length()){
			if(input1.charAt(indexString1)!=input2.charAt(indexString2)){
				countEdits++;
				if(countEdits>1)
					return false;
			}
			indexString1++;
			indexString2++;
		}
		return false;
	}

}
