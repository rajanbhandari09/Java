package com.problems.algorithms.sorting;

import java.util.Scanner;

public class InsertElementIntoSortedList {
	public static void insertIntoSorted(int[] ar) {
		int size = ar.length;
		int number = ar[size-1];
		for(int i=0;i<size-1;i++){
			if(number<ar[size-2-i]){
				ar[size-1-i]=ar[size-2-i];
			print(ar);
			
			}
			else{
				ar[size-1-i]=number;
				print(ar);
			break;
			}
				
		}
		if(number<ar[0]){
			ar[0]=number;
			print(ar);
	}
		  
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
int[] numbers = new int[size];
for(int i=0;i<size;i++){
	numbers[i]=sc.nextInt();
	
}
insertIntoSorted(numbers);


	}
	
	public static void print(int[] numbers){
		for(int num: numbers)
			System.out.print(num+" ");
		System.out.println();
	}

}
