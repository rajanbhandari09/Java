package com.problems.javafundamentals.files;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while(sc.hasNext()){
			sb.append(i+" "+sc.nextLine()+"\n");
			i++;
			}
		
		System.out.println(sb);
		
}
}
