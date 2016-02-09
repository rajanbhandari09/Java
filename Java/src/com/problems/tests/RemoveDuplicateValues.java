package com.problems.tests;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		
		int[] numbers = {10,10,4,4,4,3,2,2,1,1};
		
		int newlength=numbers.length;
		for(int i=0;i<newlength;i++){
			for(int j=i+1;j<newlength;j++){
				if(numbers[i]==numbers[j]){
					numbers[j]=numbers[newlength-1];
					j--;
					newlength--;
					
				}
				
			}
			
		}
		
		for(int k=0;k<newlength;k++){
			System.out.println(numbers[k]);
			
		}
		
		
		
		

	}

}
