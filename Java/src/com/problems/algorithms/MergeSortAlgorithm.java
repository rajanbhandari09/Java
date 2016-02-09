package com.problems.algorithms;

import java.util.Scanner;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
int[] numbers = {15,11,9,3,17,45,1,16,16};

mergeSort(numbers,0,numbers.length-1);
for(int i: numbers){
	System.out.println(i);
}


	}
	public static void mergeSort(int[] numbers,int p, int r){
		
		if(p<r){
			int q = (p+r)/2;
			mergeSort(numbers,p,q);
			mergeSort(numbers,q+1,r);
			merge(numbers,p,q,r);
			
			
		}
		
		
	}
	
	public static void merge(int[] numbers,int p, int q, int r ){
		int n1 = q-p+1;
		int n2 = r-q;
		int i,j;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(i =0;i<n1;i++){
			L[i]=numbers[p+i];
		}	
		for(j =0;j<n2;j++){
			R[j]=numbers[q+j+1];
		}		
		
		L[n1]= 100000;
		R[n2]= 100000;
		i=0;
		j=0;
		for (int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				numbers[k]=L[i];
				i=i+1;
				
			}
			
			else{
				numbers[k]=R[j];
				j=j+1;
			}
				
						
		}
				
	}
}
