/*Notes:
 * Hackerrank Problem: Java HashSet
 */


package com.problems.javafundamentals.collections;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
	
	Set<String> uniqueStrings = new HashSet<>(t);
	for(int i=0;i<pair_left.length;i++){
	    uniqueStrings.add(pair_left[i]+","+pair_right[i]);
	    System.out.println(uniqueStrings.size());
	    
	}
	
	
	
 }
}
