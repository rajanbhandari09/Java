package com.problems.algorithms.strings;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int diff = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
        	diff+= a[i][i]-a[i][n-1-i];
			
		}
System.out.println(Math.abs(diff));
	}

}
