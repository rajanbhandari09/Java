package com.problems.algorithms.strings;

import java.util.Scanner;

public class CheckIFAnagramHasPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//adding count variable to keep count of number of characters with odd count
		int count = 0;
String input = sc.next();
char[] chararray = input.toCharArray();
int[] charcount = new int[26];

for(char c: chararray){
	charcount[c-97]++;
	
}

for(int i=0;i<26;i++){
	if(charcount[i]%2==1){
		count++;
		
	}
	
}

if(count==0||count==1)
System.out.println("YES");
else
	System.out.println("NO");

	}

}
