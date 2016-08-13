/*Notes:
 * Hackerrank Problem - SuperReducedString
 * Problem statement - Delete adjacent letters in a string to produce a final non-reducible string. Only one pair of letters can be deleted in one operation
 * Input - String input
 * Output - non-reducible string or "Empty String" if final string is empty
 * */


package com.problems.algorithms.strings;
import java.io.*;
import java.util.*;
public class SuperReducedString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String finalstr = reduceString(input);
        if(finalstr == null)
            System.out.println("Empty String");
        else
            System.out.println(finalstr);
        
    }
    
	//Recursive approach. Repeatedly check if a string can be reduced further. If it can't be reduced further, return string. If string is completely reduced i.e. length becomes zero, return null.
	
    /*public static String reduceString(String input){
        StringBuilder sb = new StringBuilder(input);
        
        if(input.length()==0)
            return null;
        
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==input.charAt(i+1)){
                sb.delete(i,i+2);
                input = sb.toString();
                return reduceString(input);
                
            }
            
            
            
            
            
        }
        
        return input;
        
        
    }*/
	
	//Iterative Approach
    
public static String reduceString(String input){
        
		for(int i=0;i<input.length()-1;i++){
            
			if(input.charAt(i)==input.charAt(i+1)){
				if(input.length()>2){
                    input = input.substring(0,i)+input.substring(i+2,input.length());
				i=-1;
                }
                else
                    return null;
			}
			
			
		}
        
        return input;
    }

}
