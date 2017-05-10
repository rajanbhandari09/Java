package com.problems.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		List<String> stones = new ArrayList<String>();
		//Inserting all strings which represent composition of stones
		while(testcases!=0){
			String input = sc.next();
			stones.add(input);
			testcases--;
			
		}
		//Passing list of stones and printing number of gemstones
int count = checkGemstones(stones);
		System.out.println(count);
			
	}

	public static int checkGemstones(List<String> stones){
		//removing duplicates from 1st string and using for comparison with subsequent string
		char[] arr1 = stones.get(0).toCharArray();
		Set<String> characters = new HashSet<String>();
		boolean match = false;
		int count = 0;
		for(char ch: arr1){
			characters.add(""+ch);
					
		}
		for(String str: characters){
		for(int i=1;i<stones.size();i++){
			if(!stones.get(i).contains(str)){
				match = false;
				break;
			}
			else
				match=true;
			
		}
		if(match)
		count++;
		}
		
		return count;
		
		
	}
	
	
}
