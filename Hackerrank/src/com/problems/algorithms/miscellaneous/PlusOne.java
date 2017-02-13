package com.problems.algorithms.miscellaneous;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0)
        return digits;
        
        for(int i=digits.length-1;i>-1;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
            
            
        }
        
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
