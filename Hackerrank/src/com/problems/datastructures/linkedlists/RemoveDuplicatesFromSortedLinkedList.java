//Leetcode problem# 83
package com.problems.datastructures.linkedlists;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class RemoveDuplicatesFromSortedLinkedList {
public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null||head.next==null)
        return head;
        
        else{
            
            ListNode current = head;
            ListNode nextNode = current.next;
            
            while(nextNode!=null){
                
                if(current.val == nextNode.val){
                    
                    deleteNode(current,nextNode);
                    nextNode = current.next;
                }
                
                else{
                    current = nextNode;
                    nextNode = nextNode.next;
                    
                }
            }
            
            
            
            
           return head; 
            
        }
        
        
        
    }
    
    public void deleteNode(ListNode prev, ListNode nodeToBeDeleted){
        prev.next = nodeToBeDeleted.next;
        nodeToBeDeleted.next = null;
        
        
        
        
    }
	
	
	
	
}
