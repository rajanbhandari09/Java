package com.problems.datastructures.stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/** Problem statement
 * Given a sequence consisting of parentheses, determine whether the expression is balanced. 
 * A sequence of parentheses is balanced if every open parentheses can be paired uniquely with a closed parentheses that occurs after the former. 
 * Also, the interval between them must be balanced. 
 * You will be given three types of parentheses: (, {, and [.
 */

public class BalancedParantheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numberofstrings = sc.nextInt();
		List<String> inputs = new ArrayList<String>();
		for(int i=0;i<numberofstrings;i++){
		inputs.add(sc.next());
		}
		Iterator<String> it = inputs.iterator();
		while (it.hasNext()){
			checkBalanced(it.next());
		}
		
	}
	
	public static void checkBalanced(String input){
		Stack<Character> myStack = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			
		switch(input.charAt(i)){
			
		case '}':
			if(myStack.empty()){
				myStack.push(input.charAt(i));
			}
			else if(myStack.peek().toString().equals("{")){
				myStack.pop();
			}
			else
				myStack.push(input.charAt(i));
				break;
			
		case ']':
			if(myStack.empty()){
				myStack.push(input.charAt(i));
			}
			else if(myStack.peek().toString().equals("[")){
				myStack.pop();
			}
			else
				myStack.push(input.charAt(i));
			
			break;
		case ')':
			if(myStack.empty()){
				myStack.push(input.charAt(i));
			}
			else if(myStack.peek().toString().equals("(")){
				myStack.pop();
				
			}
			else
				myStack.push(input.charAt(i));
			break;
			
		default:
				myStack.push(input.charAt(i));
				
		}	
		}
		
		if(myStack.empty()){
			System.out.println("YES");
		}
		else
			System.out.println("NO");

	}
	
}
