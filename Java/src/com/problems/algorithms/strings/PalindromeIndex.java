package com.problems.algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int testcases = sc.nextInt();
while(testcases!=0){
	String input = sc.next();
	if(checkPalindromeIndex(input)==-1)
		System.out.println(-1);
	else{
	//int result = checkIndex(input,0,input.length());
		//System.out.println(result);
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=input.charAt(input.length()-1-i)){
				if(checkPalindromeIndex(input.substring(i, input.length()-2-i))==-1){
					System.out.println(input.charAt(input.length()-1-i));
					break;
				}
				else{
					System.out.println(input.charAt(i));
				break;
				}
			}
		}
	
	}
	testcases--;
	
	
}
	}

	private static int checkPalindromeIndex(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		if(sb.toString().equals(input))
			return -1;
		else
			return 0;
		
	}

	/*private static int checkIndex(String input,int leftindex,int rightindex) {
		
		
		int result = 0;
		String rightpart = input.substring(leftindex+1,rightindex);
		String leftpart = input.substring(leftindex, rightindex-1);
		
		
		if(checkPalindromeIndex(rightpart)==-1){
			result = leftindex;
			
		}
		else if(checkPalindromeIndex(leftpart)==-1){
			result = rightindex-1;
			
		}
		
		else{
			result = checkIndex(input,leftindex+1,rightindex-1);
			
		}
		
		return result;
	
	}
*/}
