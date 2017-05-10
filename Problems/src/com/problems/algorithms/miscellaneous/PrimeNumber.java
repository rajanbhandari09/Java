package com.problems.algorithms.miscellaneous;

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
public static void checkPrime(int number){
        
        boolean flag = true;
            if(number>=2){
            	if(number==2)
                    System.out.println("Prime");
            	else if(number%2!=0){
            		for(int j=2;j*j<=number;j++){
            			if(number%j==0){
                            System.out.println("Not prime");
                            flag = false;
                            break;
                            }
            			}
            		if(flag)
                    System.out.println("Prime");
            		}
            	else
                    System.out.println("Not prime");
            	}
            else
                    System.out.println("Not prime");
            }
	/*public static void checkPrime(int input){
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

	}*/





}
