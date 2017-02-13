package com.problems.algorithms.strings;

public class StringSegments {
	public int countSegments(String s) {
        if(s==null||s.length()==0)
        return 0;
        
        int countWords = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' '))
            countWords++;
        }
        
        return countWords;
        
    }
}
