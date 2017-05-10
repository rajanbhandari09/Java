/*Class DeleteDuplicateValues contains method RemoveDuplicates method which takes as input
 *a sorted linked list and removes duplicate values from the linked list and return its head.*/

package com.problems.datastructures.linkedlists;

public class DeleteDuplicateValues {

	Node RemoveDuplicates(Node head) {
		  if(head == null)
		      return head;
		    else{
		    Node temp = head;
		        while(temp.next!=null){
		            if(temp.data == temp.next.data)
		                temp.next = temp.next.next;
		            else
		                temp = temp.next;
		            
		            
		            
		        }
		    return head;
		    
		    }
		    
		}
	
	
}
