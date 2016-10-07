package com.problems.algorithms.dynamic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DavisStaircase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
            arr[i]=-1;
            }
            System.out.println(numberOfWays(n,arr));
            
            
            
        }
        
        in.close();
        
    }
	
	public static int numberOfWays(int n,int[] arr){
        if(n==0)
            return 1;
        else if(n<0)
            return 0;
        else {
            if(arr[n-1]==-1)
            arr[n-1] = numberOfWays(n-1,arr) + numberOfWays(n-2,arr) + numberOfWays(n-3,arr);
            return arr[n-1];
            
            
            
            
        }
        
        
        
        
    }
}

