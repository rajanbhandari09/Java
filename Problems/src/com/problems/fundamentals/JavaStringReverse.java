package com.problems.fundamentals;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		//char[] read = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		if(input.equals(sb.reverse().toString()))
				System.out.println("Yes");
		else
			System.out.println("No");
		
		
		
	}

}
