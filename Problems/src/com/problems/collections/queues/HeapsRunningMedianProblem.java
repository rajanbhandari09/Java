package com.problems.collections.queues;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HeapsRunningMedianProblem {
static Queue<Integer> maxHeap;
static Queue<Integer> minHeap;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        maxHeap = new PriorityQueue<Integer>(10,Collections.reverseOrder());
            minHeap = new PriorityQueue<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            calculateMedian(a[a_i],a_i);
        }
        
        
    }
    
    public static void calculateMedian(int a, int length){
        
        if(length%2==0){
            maxHeap.add(a);
        }
        else{
            minHeap.add(a);
            
        }
        
        if(minHeap.peek()!=null){
        if(maxHeap.peek()>minHeap.peek()){
            Integer temp = minHeap.remove();
            minHeap.add(maxHeap.peek());
            maxHeap.remove();
            maxHeap.add(temp);
            
            
            
        }
        
        
        }
        
        if(length%2==0){
            System.out.println((float)maxHeap.peek());
        }
        else{
            float median = (float)(maxHeap.peek()+minHeap.peek())/2;
            System.out.println(median);
            
        }
        
    }
    
}

