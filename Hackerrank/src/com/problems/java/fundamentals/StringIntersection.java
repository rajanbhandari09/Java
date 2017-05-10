package com.problems.java.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntersection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        String s3 = IntersectStrings(s2,s1);
        	System.out.println(s3);
       
	
	}
		public static String IntersectStrings(String x, String y)
		{
			
		StringBuilder sb1 = new StringBuilder();
		sb1.append(x);
		StringBuilder sb2 = new StringBuilder();
		sb2.append(y);
		StringBuilder sb3 = new StringBuilder();
		
		System.out.println(sb1.length());
		for(int i=0;i<sb1.length();i++){
			for(int j=0;j<sb2.length();j++){
				if(sb1.charAt(i)==sb2.charAt(j)){
					sb3.append(sb1.charAt(i));
					sb1.deleteCharAt(i);
					sb2.deleteCharAt(j);
						i = i-1;
						j = j-1;
						break;
				}
				
				
			}
			
		}
		
		
		char[] ch = sb3.toString().toCharArray();
		Arrays.sort(ch);
		String str = new String(ch);
		
		
		if (str.equals(""))	{
			return null;
		}
		else{
		return str;
			
		}	
			}
			
			
		}
	


