package com.problems.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	/*static boolean isAnagram(String A, String B) {
	      
		if(A.length()!=B.length())
			return false;
		else
		{
			
			char[] arr1 = A.toLowerCase().toCharArray();
			char[] arr2 = B.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			String E = new String(arr1);
			String F = new String(arr2);
			if(E.equalsIgnoreCase(F))
				return true;
			else
				return false;
			
			
		}
		
			   }*/
	
	static boolean isAnagram(String A, String B){
		if(A.length()!=B.length())
			return false;
		else{
		char[] arr1 = A.toLowerCase().toCharArray();
		char[] arr2 = B.toLowerCase().toCharArray();
		int[] charcount = new int[26];
		
		
		for(int i=0;i<26;i++){
			
			charcount[i]=0;
			
		}
		
		for(char ch: arr1){
			charcount[ch-97]++;
			
		}
		
		for(char ch: arr2){
			if(--charcount[ch-97]<0)
				return false;
			
		}
		
		return true;
		
		
	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

	}

}
