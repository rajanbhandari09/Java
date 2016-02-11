package com.problems.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
			
		}
		
		Arrays.sort(numbers);
		for(int i=0;i<size;i++){
			if(number==numbers[i]){
				System.out.println(i);
				break;
			}
		}
		

	}

}
