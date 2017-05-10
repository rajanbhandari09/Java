package com.problems.fundamentals;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length = A.length()+B.length();
        int compare = A.compareTo(B);
        System.out.println(length);
        if(compare<=0)
        System.out.println("No");
        else
        System.out.println("Yes");
        StringBuilder Sb = new StringBuilder();
        String firstcharA = A.substring(0, 1);
        String firstcharB = B.substring(0, 1);
        Sb.append(firstcharA.toUpperCase() + A.substring(1, A.length())+" "+ firstcharB.toUpperCase() + B.substring(1, B.length()));
System.out.println(Sb);
	}

}
