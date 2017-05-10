package com.problems.collections.queues;

/*Notes:
This problem implements Java PriorityQueue class which orders elements in their natural order.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sweetness {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> cookies = new PriorityQueue();
        for(int i=0;i<number;i++){
            cookies.add(sc.nextInt());
            
            
            
        }
        int count = 0;
        while(cookies.size()>1){
            
        if(cookies.peek()>=K){
            break;
        }
            
        else{
            int firstCookie = cookies.remove();
            int secondCookie = cookies.remove();
            int resultantCookie = 1*firstCookie + 2*secondCookie;
            cookies.add(resultantCookie);
            count++;
            
            
        }
        }
        if(cookies.peek()>=K)
            System.out.println(count);
        else
            System.out.println("-1");
        
        
        
        
        
    }
}