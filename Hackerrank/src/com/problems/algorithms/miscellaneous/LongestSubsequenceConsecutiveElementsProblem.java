package com.problems.algorithms.miscellaneous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Example: Given an array [12,4,12,13,22], the length of longest subarray whose elements when sorted form a continous sequence (diff 0 or 1) with duplicates included i.e. [12,12,13] is 3.
*/
public class LongestSubsequenceConsecutiveElementsProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lengthArray = input.nextInt();
		int[] numbers = new int[lengthArray];
		for(int i=0;i<lengthArray;i++){
			numbers[i] = input.nextInt();			
		}
		//Using Sorting Approach. This works when array contains duplicates also.
System.out.println("The longest subarray with consecutive elements is: "+longestConsecutiveSubarrayUsingSorting(numbers));
//Using HashSet Approach. Doesn't work when array contains duplicates.
//System.out.println("The longest subarray with consecutive elements is: "+longestConsecutiveSubarrayUsingHashSet(numbers));

	}

	/*private static int longestConsecutiveSubarrayUsingHashSet(int[] numbers) {
		int longestConsecutiveSubarrayLength = 0;
		int subArrayLength = 0;
		Set<Integer> arrayNumbers = new HashSet<>();
		for(int number: numbers){
			arrayNumbers.add(number);
		}
		
		for(int number: numbers){
			subArrayLength =1;
			if(!arrayNumbers.contains(number-1)){
				while(arrayNumbers.contains(number+1)){
					subArrayLength++;		
					number++;
				}
				if(longestConsecutiveSubarrayLength<subArrayLength)
					longestConsecutiveSubarrayLength=subArrayLength;
			}
				
		}
		
		return longestConsecutiveSubarrayLength;
	}*/

	private static int longestConsecutiveSubarrayUsingSorting(int[] numbers) {
		int longestConsecutiveSubarrayLength = 0;
		int subArrayLength = 0;
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length-1;i++){
			subArrayLength=1;
			if(numbers[i]==numbers[i+1]||numbers[i]+1==numbers[i]){
				subArrayLength++;
				
			
			}
			if(longestConsecutiveSubarrayLength<subArrayLength)
				longestConsecutiveSubarrayLength=subArrayLength;
			else{
				subArrayLength=1;
			}
		}
		
		return longestConsecutiveSubarrayLength;
	}

}
