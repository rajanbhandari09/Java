//valid palindrome# 125
package com.problems.algorithms.strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
            if(!isAlphabet(s.charAt(i))&&!isNumber(s.charAt(i))){
                i++;
                
                
                
            }
            
            
            else if(!isAlphabet(s.charAt(j))&&!isNumber(s.charAt(j))){
                j--;
                
                
                
            }
            
            else{
            
           if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))
           return false;
           
           
            else
            i++;j--;
            
            }
            
        }
        
        
        return true;
        
        
    }
    
    public boolean isAlphabet(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
        return true;
        else
        return false;
        
    }
    
    public boolean isNumber(char c){
        if(c>='0'&&c<='9')
        return true;
        else
        return false;
        
    }
    
    
    
    
    
}
