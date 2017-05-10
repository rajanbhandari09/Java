package com.problems.algorithms.sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MergeSortCountingInversionsProblem {
	public static long countInversions(int[] arr){
	    
        return mergeSort(arr,new int[arr.length],0,arr.length-1);
        
        
        
    }
  
    public static long mergeSort(int[] arr, int[] temp,int left,int right){
        long inversionCounter = 0;
        
        if(left>=right)
            return inversionCounter;
        
        
        
       inversionCounter += mergeSort(arr,temp,left,(left+right)/2);
        inversionCounter += mergeSort(arr,temp,(left+right)/2+1,right);
        
       inversionCounter += merge(arr,temp,left,right);
        
        return inversionCounter;
        
        
        
    }
    
    public static long merge(int[] arr,int[] temp, int left,int right ){
        long inversionCounter = 0;
        
        int left_end = (left+right)/2;
        int right_start = left_end+1;
        int size = right-left+1;        
        
        int leftindex = left;
        int rightindex = right_start;
        int index = left;
        
        while(leftindex<=left_end && rightindex <=right){
            if(arr[leftindex]>arr[rightindex]){
                
                temp[index] = arr[rightindex];
                rightindex++;
                inversionCounter+= left_end - leftindex+1;;
                
            }
            
            else{
                temp[index] = arr[leftindex];
                leftindex++;
                
                
            }
            index++;
        }
        
        System.arraycopy(arr,leftindex,temp,index,left_end-leftindex+1);
        System.arraycopy(arr,rightindex,temp,index,right-rightindex+1);
        System.arraycopy(temp,left,arr,left,size);
           
        return inversionCounter;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
}
