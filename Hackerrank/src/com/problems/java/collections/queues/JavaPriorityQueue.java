package com.problems.java.collections.queues;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Studen{
   private int token;
   private String fname;
   private double cgpa;
   public Studen(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class Checks implements Comparator<Studen>{
    public int compare(Studen s1, Studen s2){
        if(s1.getCgpa()>s2.getCgpa())
            return -1;
        else if(s1.getCgpa()<s2.getCgpa())
            return 1;
            else{
            if(!s1.getFname().equals(s2.getFname()))
                return s1.getFname().compareTo(s2.getFname());
            else{
                return s1.getToken()-s2.getToken();
                
                
                
                
            }
            
            
        }
        
    }
    
}
public class JavaPriorityQueue {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
        Checks c = new Checks();
        Queue<Studen> queue = new PriorityQueue<Studen>(1,c);
      
        while(totalEvents>0){
         String event = in.next();
            
          if(event.equals("ENTER")){
              String name = in.next();
              double cgpa = in.nextDouble();
              int token = in.nextInt();
              Studen student = new Studen(token,name,cgpa);
              queue.add(student);
              
          }  
          else if(event.equals("SERVED")){
              if(queue.peek()!=null)
              queue.remove();
              
              
          }
            
            
           
         totalEvents--;
      }
        if(queue.peek()==null)
            System.out.println("EMPTY");
        else{
            while(queue.peek()!=null){
                System.out.println(queue.remove().getFname());
                
            }
            
        }
        
    }
}

