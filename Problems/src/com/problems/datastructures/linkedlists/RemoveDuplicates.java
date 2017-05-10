package com.problems.datastructures.linkedlists;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicates{

	public static Node removeDuplicates(Node head) {
		Node temp = head;
		if(temp==null)
			return temp;
		else{
			
			Set<Integer> data = new HashSet<Integer>();
			
			while(temp.next!=null){
				data.add(temp.data);
				if(data.contains(temp.next.data)){
					
					temp.next = temp.next.next;
					
				}
				else{
				
				temp = temp.next;
			}
			}
			
			return head;
			
		}
		
		
		

	}



	
}