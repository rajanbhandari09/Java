/*Notes:
 * Hackerrank Problem - CamelCase
 * Problem statement - Print the number of words in the input string 
 * Input - String s
 * Output - count of number of words in s
 * */

package com.problems.algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter = 1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91)
                counter++;
            
            
        }
        
        System.out.println(counter);
    }
}
