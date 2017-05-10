package com.problems.datastructures.arrays;

import java.util.Scanner;

public class JavaArrayGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++){
            
            int arraySize = sc.nextInt();
            int jumpSize = sc.nextInt();
            
            int[] arr = new int[arraySize];
            for(int j=0;j<arraySize;j++){
                arr[j] = sc.nextInt();
                
                
            }
            
            if(checkWin(arr,jumpSize,0))
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
    
    public static boolean checkWin(int[] arr, int jumpSize, int currentPosition ){
        if(currentPosition>arr.length-1 )
            return true;
        else if(currentPosition<0)
            return false;
        else if(arr[currentPosition]==1)
            return false;
            
        arr[currentPosition] =1;
        
        
        return checkWin(arr,jumpSize,currentPosition+1) || checkWin(arr,jumpSize,currentPosition-1) || checkWin(arr,jumpSize,currentPosition+jumpSize);
         
        
        
        
        
        
    } 

}
