package com.problems.java8;

import java.util.ArrayList;
import java.util.Scanner;



public class CheckPrimalityUsingStreams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}
		
		numbers.
		stream()
		.filter(a->{
			if(checkPrime(a))
			return true;
			else
				return false;
			
			
		})
		.forEach(e->System.out.println(e));
		
		
				
				
				
				
				
		
		
		
		
		

	}
	
public static boolean checkPrime(int number){
        
        boolean flag = true;
            if(number>=2){
            	if(number==2)
                    return true;
            		
            		//System.out.println("Prime");
            	else if(number%2!=0){
            		for(int j=2;j*j<=number;j++){
            			if(number%j==0){
                            return false;
                            }
            			}
            		return true;
            		}
            	else
                    return false;
            	}
            
            else
                    return false;
			
            
            
            }

}
