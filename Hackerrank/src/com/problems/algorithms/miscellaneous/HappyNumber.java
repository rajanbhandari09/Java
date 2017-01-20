//Leetcode problem# 202
package com.problems.algorithms.miscellaneous;
import java.util.*;
public class HappyNumber {
    public boolean isHappy(int n) {
        if(n==1)
        return true;
        
        Set<Integer> numbersVisited = new HashSet<>();
        int sum = n;
        
        while(!numbersVisited.contains(sum)){
            
            numbersVisited.add(sum);
            sum = sumOfSquareOfDigits(sum);
            
            if(sum==1)
            return true;
            
            
            
            
            
            
        }
        
        return false;
        
    }
    
    public int sumOfSquareOfDigits(int number){
        int sum =0;
        int digit = 0;
        
        while(number!=0){
            digit = number%10;
            sum += digit*digit;
            number = number/10;
            
        }
        
        return sum;
        
        
        
    }
}
