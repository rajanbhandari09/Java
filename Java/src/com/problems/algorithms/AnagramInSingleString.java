package com.problems.algorithms;

import java.util.Scanner;

public class AnagramInSingleString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases>0){
			String input = sc.next();
			checkAnagramInStrings(input);
			testcases--;
		}

	}
public static void checkAnagramInStrings(String input){
	char[] arr1 = input.substring(input.length()/2,input.length()).toCharArray();
	char[] arr2 = input.substring(0, input.length()/2).toCharArray();
	int[] count1 = new int[26];
	int[] count2 = new int[26];
	int diff = 0;
	int count = 0;
	if(input.length()%2==1)
		System.out.println(-1);
	else{
		for(char ch: arr1){
			count1[ch-97]++;
		}
		for(char ch: arr2){
			count2[ch-97]++;
		}
		for(int i=0;i<26;i++){
			diff = count1[i]-count2[i];
			if(diff>0)
				count+=diff;
		}
		System.out.println(count);
		
	}
	
}
}
