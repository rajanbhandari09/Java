/*Notes:-
 * Hackerrank Problem - Java Arraylist
 */


package com.problems.collections.arraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List[] numbers = new List[n];
        for(int i=0;i<n;i++){
            numbers[i] = new ArrayList();
            int listsize = sc.nextInt();
            for(int j =0;j<listsize;j++){
                numbers[i].add(sc.nextInt());
            }
        }
        
        int totalQueries = sc.nextInt();
        for(int k=0;k<totalQueries;k++){
            queryElement(numbers,sc.nextInt(),sc.nextInt());
            
        }
        
    }
    
    public static void queryElement(List[] numbers, int line, int position){
        
        if(line > numbers.length ){
            System.out.println("ERROR!");
        }
        else if(numbers[line-1].size() < position){
            System.out.println("ERROR!");
            
        }
            
        else{
            
            System.out.println(numbers[line-1].get(position-1));
        }
        
    }
        
        
}
