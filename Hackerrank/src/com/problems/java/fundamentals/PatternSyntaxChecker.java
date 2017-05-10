package com.problems.java.fundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		
		
		String pattern = "\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s1);
		
		System.out.println(m.find());
		
		
		/*if(s1.matches(".*\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d\\d\\d.*")||s1.matches("\\(\\d\\d\\d\\)\\s\\d\\d\\d-\\d\\d\\d\\d")){
			System.out.println("true");
		}
		else
			System.out.println("false");*/
	      /*int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	             try{
	                 Pattern.compile(pattern);
	                 System.out.println("Valid");
	             }
	      catch(PatternSyntaxException e){
	System.out.println("Invalid");      
	      }
	          
	          testCases--;
	      
	      }*/

	}

}
