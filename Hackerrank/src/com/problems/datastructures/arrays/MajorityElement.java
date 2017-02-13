package com.problems.datastructures.arrays;

public class MajorityElement {

	
		 public int majorityElement(int[] nums) {
		        
		        int majorityIndex = 0, counter = 1;
		        
		        for(int i=1;i<nums.length;i++){
		            
		            if(counter==0){
		                majorityIndex = i;
		                counter++;
		            }
		            else if(nums[majorityIndex]==nums[i]){
		                counter++;
		            }
		            else{
		                counter--;
		            }
		            
		        }
		        
		        return nums[majorityIndex];
		    }

	

}
