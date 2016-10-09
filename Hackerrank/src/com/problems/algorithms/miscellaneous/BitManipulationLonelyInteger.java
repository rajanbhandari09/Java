package com.problems.algorithms.miscellaneous;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitManipulationLonelyInteger {
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
    
    public static int lonelyInteger(int[] a){
        
        int number = a[0];
      for(int i=1;i<a.length;i++){
          number = number^a[i];
          
          
          
      }
        
        return number;
        
    }
}

