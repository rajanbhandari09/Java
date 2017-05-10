package com.problems.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation{
	public boolean test( int n);
	
	
	
}

class MyMath {
public PerformOperation is_odd(){
    
    return a -> a%2!=0;
    
}

public PerformOperation is_prime(){
    
return a -> {
    for(int i=2;i*i<=a;i++){
        if(a%i==0)
            return false;
    }
    return true;
};
      
}

public PerformOperation is_palindrome(){
return a -> {
    String s = Integer.toString(a);
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString().equals(s);
    
};
    
}

public boolean checker(PerformOperation p, int n){
	
	return p.test(n);
	
	
}

}

public class JavaLambdaExpressions {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.is_odd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.is_prime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.is_palindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}