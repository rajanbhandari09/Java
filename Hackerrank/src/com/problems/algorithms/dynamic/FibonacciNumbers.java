package com.problems.algorithms.dynamic;

import java.util.*;

public class FibonacciNumbers {

   
    static int[] M;
    public static int fibonacci(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            if(M[n-1]!=0)
                return M[n-1];
            else{
                M[n-1] = fibonacci(n-1) + fibonacci(n-2);
            return M[n-1];
            }
            
        }
      
      
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        M = new int[n];
        scanner.close();
        System.out.println(fibonacci(n));
    }
}

