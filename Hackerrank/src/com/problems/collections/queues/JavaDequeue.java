package com.problems.collections.queues;

import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> s = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
int unique = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
           deque.add(num);
            s.add(num);
            if(deque.size()==m){
                
                if(unique<=s.size()){
                    unique = s.size();
                    
                }
                
                int remove = (int)deque.remove();
                if(!deque.contains(remove))
                s.remove(remove);
            }
        }
        
        System.out.println(unique);
        
        
    }
}

