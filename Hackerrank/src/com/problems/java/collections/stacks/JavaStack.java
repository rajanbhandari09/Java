/*Notes:
 * Hackerrank Problem: Java Stack
 * Solution mentioned here is without using stacks. Refer datastructures.stacks package for Stack solution
 */

package com.problems.java.collections.stacks;

import java.util.*;
class JavaStack{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            boolean result = checkBalanced(input);
          System.out.println(result);
      }
       
       
       
      
   }
    
    public static boolean checkBalanced(String s){
        int[] openingBrackets = new int[3];
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='(')
            openingBrackets[0]++;
            else if(s.charAt(i)=='{')
                openingBrackets[1]++;
                else if(s.charAt(i)=='[')
                openingBrackets[2]++;
               else if(s.charAt(i)==')')
            openingBrackets[0]--;
                else if(s.charAt(i)=='}')
                openingBrackets[1]--;
            else if(s.charAt(i)==']')
                openingBrackets[2]--;
        }
        
        if(openingBrackets[0]<0 || openingBrackets[0]>0 ||openingBrackets[1]<0 || openingBrackets[1]>0 ||openingBrackets[1]<0 || openingBrackets[1]>0)
            return false;
        else
            return true;
    }
}

