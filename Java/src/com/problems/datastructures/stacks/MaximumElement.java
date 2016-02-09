package com.problems.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int queries = sc.nextInt();
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		for(int i=0;i<queries;i++){
			int input = sc.nextInt();
		switch(input){
		case 1:
			int number = sc.nextInt();
			if(s2.empty()||number>=s2.peek().intValue()){
				s2.push(number);
			}
			s1.push(number);
			break;
		case 2:
			if(!s1.empty())
			{
				if(s1.peek().intValue()==s2.peek().intValue()){
					s1.pop();
					s2.pop();
				}
				else
					s1.pop();
			}
					
			break;
		case 3:
			if(!s2.empty())
				System.out.println(s2.peek());
		break;
		}
		
		
		
		
	}
	}
	
	
	
}
