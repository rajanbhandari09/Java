package com.problems.collections.map;

import java.util.*;

public class HashTableRansonNoteProblem {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String[] magazineWords;
    String[] noteWords;
    public HashTableRansonNoteProblem(String magazine, String note) {
        magazineWords = magazine.split(" ");
        noteWords = note.split(" ");
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        
        
        
        
    }
    
    public boolean solve() {
        
        for(String s: magazineWords){
            int count = 1;
            if(magazineMap.containsKey(s))
                count += magazineMap.get(s);
            magazineMap.put(s,count);
        }
        
        for(String s: noteWords){
            if(magazineMap.containsKey(s)&&magazineMap.get(s)!=0)
                magazineMap.put(s,magazineMap.get(s)-1);
            else
                return false;
            
            
            
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        HashTableRansonNoteProblem s = new HashTableRansonNoteProblem(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

