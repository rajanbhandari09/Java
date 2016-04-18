package com.problems.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
			
		}
		
		partition(numbers);

	}

	private static int[] partition(int[] ar) {
		if(ar.length!=1&&ar.length!=0){
			
		int pivot = ar[0];
		List<Integer> leftpartition = new ArrayList<Integer>();
		List<Integer> rightpartition = new ArrayList<Integer>();
		List<Integer> equal = new ArrayList<Integer>();
				
		for(int i=0;i<ar.length;i++){
			if(ar[i]<pivot)
			leftpartition.add(ar[i]);
			else if(ar[i]>pivot)
				rightpartition.add(ar[i]);
			else
				equal.add(ar[i]);
		}
		
		int[] leftsubarray = new int[leftpartition.size()];
		int[] rightsubarray = new int[rightpartition.size()];
		int[] equalsubarray = new int[equal.size()];
		for(int i=0;i<leftpartition.size();i++){
			leftsubarray[i]=leftpartition.get(i).intValue();
			
		}
		for(int i=0;i<rightpartition.size();i++){
			rightsubarray[i]=rightpartition.get(i).intValue();
			
		}
		for(int i=0;i<equal.size();i++){
			equalsubarray[i]=equal.get(i).intValue();
			
		}
		leftsubarray = partition(leftsubarray);
		rightsubarray = partition(rightsubarray);
		int[] finalsubarray = new int[leftsubarray.length+equalsubarray.length+rightsubarray.length];
		for(int i=0;i<leftsubarray.length;i++){
			finalsubarray[i]=leftsubarray[i];
		}
		for(int i = 0;i<equalsubarray.length;i++){
			finalsubarray[leftsubarray.length+i] = equalsubarray[i];
		}
		for(int i = 0;i<rightsubarray.length;i++){
			finalsubarray[leftsubarray.length+equalsubarray.length+i] = rightsubarray[i];
		}
		printArray(finalsubarray);
		return finalsubarray;
		}
		else
			return ar;
			
	}
	public static void printArray(int[] ar) {
        for(int n: ar){
           System.out.print(n+" ");
        }
          System.out.println("");
     }
}
