package com.problems.algorithms;

import java.util.Scanner;

public class StaircaseProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder asterik = new StringBuilder();
		
		for(int i=0;i<n;i++){
			String format = "%"+Integer.toString(n)+"s";
			asterik.append("#");
			System.out.printf(format,asterik);
			System.out.println();
			
			}
		
	}

}
