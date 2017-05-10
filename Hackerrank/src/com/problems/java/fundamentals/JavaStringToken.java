package com.problems.java.fundamentals;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringToken {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();
		StringTokenizer st = new StringTokenizer(s,"!,?._'@ "); 
		System.out.println(st.countTokens()); 
		while (st.hasMoreTokens()) { System.out.println(st.nextToken()); }
		/*Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        String s = str.trim();
        
            if(s.length()==0){
                System.out.println(0);
            }
            else if(s.length()>400000){
            	
            }
            else{
      String[] output = s.split("[!, ?._'@]+");
      System.out.println(output.length);
      for(String c: output){
    	  System.out.println(c);
      }
        }*/
    	  
    	  
      }

	}


