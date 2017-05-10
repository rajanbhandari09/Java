package com.problems.fundamentals;

import java.util.Scanner;

public class StaticInitializerBlock {

	static int B;
	static int H;
	static boolean flag;
	
	static{
		
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		
		try{
			if(B<=0||H<=0){
				throw new Exception("Breadth and height must be positive");
				
			}
			else{
				
				flag = true;
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
			//System.out.println("java.lang.Exception: Breadth and height must be positive");
			
		}
		
		
		
	}
		public static void main(String[] args){
			
			
			if(flag){
				int area = B*H;
				System.out.print(area);
				
				
			}
			
		}
		
	}


