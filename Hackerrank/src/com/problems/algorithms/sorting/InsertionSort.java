package com.problems.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
	
		}
		insertionSort(numbers);

	}

	private static void insertionSort(int[] ar) {
		int size = ar.length;
		for(int i=1;i<size;i++){
			int number = ar[i];
			
			for(int j=0;j<i;j++){
				if(number<ar[i-1-j]){
					ar[i-j]=ar[i-1-j];
				}
				else{
					ar[i-j]=number;
					break;
				}
					
			}
			
			if(number<ar[0]){
				ar[0]=number;
			
			}
			printArray(ar);
		}
		
	}

	private static void printArray(int[] ar) {
		for(int num: ar){
			System.out.print(num+" ");
			
		}
		System.out.println();
	}

}
