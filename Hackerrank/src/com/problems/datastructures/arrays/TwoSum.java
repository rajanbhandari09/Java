//Leetcode Problem 1
//Simplest solution: Brute Force - calculate and compare sum of every two elements in array with target. Time Complexity = O(n^2), Space Complexity = O(n)
//Optimized solution: Using hashmap - Time Complexity = O(n), Space Complexity = O(n)

package com.problems.datastructures.arrays;

import java.util.*;


public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
     
     int[] result = new int[2];
     Map<Integer,Integer> values = new HashMap<>();
     
     for(int i=0;i<nums.length;i++){
         if(values.containsKey(nums[i])){
             
             result[1] = i;
             result[0] = values.get(nums[i]);
             
             
         }
         
         else{
             
             values.put(target-nums[i],i);
             
             
         }
         
     }
     
     return result;
     
}

}
