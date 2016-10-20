/*Notes:
 * Hackerrank Problem: Java List
 * 
 */

package com.problems.java.collections.arraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<listSize;i++){
            numbers.add(sc.nextInt());
            
            
        }
        int totalQueries = sc.nextInt();
        for(int j=0;j<totalQueries;j++){
            String input = sc.next();
            if(input.equals("Insert")){
                numbers.add(sc.nextInt(),sc.nextInt());
                
            }
            
            if(input.equals("Delete")){
                numbers.remove(sc.nextInt());
                
            }
            
        }
        
        for(Integer number: numbers){
            System.out.print(number +" ");
            
            
        }
        
        
    }
}

