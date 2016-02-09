package com.problems.javafundamentals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
	int[] count = new int[26];
		char[] inputarr = input.toLowerCase().toCharArray();
		for(char c: inputarr){
			if(c>=65&&c<=90){
				count[c-65]++;
				
			}
			else if(c>=97&&c<=122){
				count[c-97]++;
				
			}
						
		}
		
		for(int i=0;i<26;i++){
			if(count[i]==0){
				System.out.println("not pangram");
				System.exit(0);
	
			}
		}
		
		System.out.println("pangram");
		
		
		/*Set<String> s = new HashSet<String>();


		char[] inputarr = input.toLowerCase().toCharArray();
		for(char c: inputarr){
			System.out.println(c);
			if(c!=' ')
				s.add(""+c);

		}
		System.out.println(s.size());
*/

	}

}
