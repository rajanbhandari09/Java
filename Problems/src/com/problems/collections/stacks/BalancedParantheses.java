package com.problems.collections.stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean isBalanced(String input){
        if(input.length()%2!=0)
            return false;
        
        else{
            Deque<Character> stackHoldingOpeningParentheses = new ArrayDeque<>();
            
            for(int i=0;i<input.length();i++){
                
                if(input.charAt(i)=='('||input.charAt(i)=='{'||input.charAt(i)=='[')
                    stackHoldingOpeningParentheses.push(input.charAt(i));
                
                else if(input.charAt(i)==')'||input.charAt(i)=='}'||input.charAt(i)==']')
                    {
                    
                    if(stackHoldingOpeningParentheses.isEmpty())
                    return false;
                    
                    else{
                        if(input.charAt(i)==')'&&stackHoldingOpeningParentheses.peek()!='('||input.charAt(i)=='}'&&stackHoldingOpeningParentheses.peek()!='{'||input.charAt(i)==']'&&stackHoldingOpeningParentheses.peek()!='[')
                            return false;
                        else
                            stackHoldingOpeningParentheses.pop();
                        }
                    
                    
                    }
                }
            
            if(stackHoldingOpeningParentheses.isEmpty())
                return true;
            else
                return false;
            
        }
        
        
        
        
        
    }
	/*public static void main(String[] args) {
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

	}*/
	
}
