package com.problems.datastructures.trees;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
        
        
        
        
    }
    
    public int binarySearch(int[] nums,int left,int right,int target){
        if(left>right){
            return left;
            
        }
        
        else{
            
            int mid = (left+right)/2;
            
            if(target==nums[mid])
            return mid;
            
            else if(target<nums[mid])
            return binarySearch(nums,left,mid-1,target);
            
            else
            return binarySearch(nums,mid+1,right,target);
            
            
            
            
        }
        
        
        
        
    }
}
