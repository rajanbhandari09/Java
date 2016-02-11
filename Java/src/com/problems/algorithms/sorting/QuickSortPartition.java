package com.problems.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSortPartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
			
		}
		
		partition(numbers);



	}

	private static void partition(int[] ar) {
		int pivot = ar[0];
		List<Integer> leftpartition = new ArrayList<Integer>();
		List<Integer> rightpartition = new ArrayList<Integer>();
		List<Integer> equal = new ArrayList<Integer>();
		List<Integer> finalstring = new ArrayList<Integer>();

		for(int i=0;i<ar.length;i++){
			if(ar[i]<pivot)
			leftpartition.add(ar[i]);
			else if(ar[i]>pivot)
				rightpartition.add(ar[i]);
			else
				equal.add(ar[i]);
		}
		
		finalstring.addAll(leftpartition);
		finalstring.addAll(equal);
		finalstring.addAll(rightpartition);
for(int i=0;i<finalstring.size();i++){
	ar[i]=finalstring.get(i).intValue();
	
}
		
		printArray(ar);
		
		
	}

	private static void printArray(int[] numbers) {
		for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i]+" ");
		
	}

}
