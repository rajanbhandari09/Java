package com.problems.java.fundamentals;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int k = sc.nextInt();
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		
		
for(int i =0;i<s.length()-k;i++){
	
	if(smallest.compareTo(s.substring(i+1, i+1+k))>0){
		smallest = s.substring(i+1, i+1+k);
				
	}
	if(largest.compareTo(s.substring(i+1, i+1+k))<0){
		largest = s.substring(i+1,i+1+k);
		
	}
	
	
	
}

System.out.println(smallest);
System.out.println(largest);
	}

}
