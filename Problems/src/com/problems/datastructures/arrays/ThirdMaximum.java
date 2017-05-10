//Leetcode problem# 414
package com.problems.datastructures.arrays;

public class ThirdMaximum {
    public int thirdMax(int[] nums) {
        
        
        long maxNumber1 = nums[0];
        long maxNumber2 = Long.MIN_VALUE;
        long maxNumber3 = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>maxNumber1){
                maxNumber3 = maxNumber2;
                maxNumber2 = maxNumber1;
                maxNumber1 = nums[i];
                
                
            }
            
            else if(nums[i]<maxNumber1&&nums[i]>maxNumber2){
                maxNumber3 = maxNumber2;
                maxNumber2 = nums[i];
                
                
                
            }
            
            
            else if(nums[i]<maxNumber2&&nums[i]>maxNumber3){
                maxNumber3 = nums[i];
                
                
            }
            
        }
        
        if(nums.length<3||maxNumber3==Long.MIN_VALUE)
        return (int)maxNumber1;
        
        else
        return (int)maxNumber3;
        
        
        
    }
}
