/*Notes:
 * Hackerrank Problem - Beautiful Binary String
 * Problem Statement - A string is not beautiful if it contains "101" substrings
 * Input - length of Binary string, n & Binary string, B
 * Output - Number of steps needed to make the string beautiful
 * 
 */
package com.problems.algorithms.strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BeautifulBinaryString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
        int count = 0;
        for(int i=0;i<n-2;i++){
            if(B.substring(i,i+3).equals("010")){
             
                count++;
                i+=2;
                
            }
            
        }
        System.out.println(count);
    }

}
