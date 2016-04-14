package com.problems.algorithms.strings;

import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input1 = sc.next();
	String input2 = sc.next();
	char[] arr1 = input1.toCharArray();
	char[] arr2 = input2.toCharArray();
	//variable to keep count of total deletions required
	int count = 0;
	int difference =0;
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for(char ch: arr1){
			count1[ch-97]++;
			
		}
		for(char ch: arr2){
			count2[ch-97]++;
			
		}
	
	for(int i=0;i<26;i++){
		
			difference = Math.abs(count1[i]-count2[i]);
			count= count+difference;
	
	}
	//printing total deletions required
	System.out.println(count);
	}

}
