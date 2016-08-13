package com.problems.algorithms;

import java.util.Scanner;

/*Notes:
1. 1 is neither prime nor composite number.
2. Below is a solution for calculating square root of a number with O(sqrt(n)) time complexity.
*/
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0;i<testcases;i++){
			int input = sc.nextInt();
			checkPrime(input);




		}
	}

	public static void checkPrime(int input){
		if(input==1)
			System.out.println("Not prime");
		else{
			for(int i=2;i*i<=input;i++){
				if(input%i==0){
					System.out.println("Not prime");
					return;
				}


			}

			System.out.println("Prime");
		}    

	}





}
