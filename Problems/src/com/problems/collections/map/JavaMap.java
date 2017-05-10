/*Notes:
 * Hackerrank Problem: Java Map
 * 
 * 
 */

package com.problems.collections.map;

import java.util.*;
import java.io.*;

class JavaMap{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
       Map<String,Integer> Phonebook = new HashMap<>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
          Phonebook.put(name,phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if(!Phonebook.containsKey(s))
              System.out.println("Not found");
          else
              System.out.println(s + "="+Phonebook.get(s));
          
      }
   }
}
