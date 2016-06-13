/*Class MergeLists contains a method MergeLists which takes as input heads of 2 sorted
 * linked lists and merge them into a single sorted linked list and returns its head.*/


package com.problems.datastructures.linkedlists;
public class MergeSortedLinkedLists {
	
	Node MergeLists(Node headA, Node headB) {
	    
	    if(headA == null)
	        return headB;
	    else if(headB == null)
	        return headA;
	        
	        else{
	     Node headC = null;
	Node temp1 = headA;
	    Node temp2 = headB;
	    
	    //Identifying the new head of output linked list
	    if(temp1.data <= temp2.data){
	        headC = temp1;
	        temp1 = temp1.next;
	        
	    }
	        else{
	            
	            headC = temp2;
	            temp2 = temp2.next;
	            
	        }
	    
	    Node temp3 = headC;
	        
	        //Comparing data in two nodes and assigning lower data node to the output linked list
	    while(temp1 != null && temp2 != null){
	        if(temp1.data <= temp2.data){
	            temp3.next = temp1;
	            temp1 = temp1.next;
	            temp3 = temp3.next;
	            
	            
	        }
	        
	        else{
	            temp3.next = temp2;
	            temp2 = temp2.next;
	            temp3 = temp3.next;
	            
	            
	            
	            
	        }
	        
	               
	    }
	    
	        //When end of one linked list is reached, merge the remaining other linked list with the output linked list
	    if(temp1 == null && temp2!=null)
	        temp3.next = temp2;
	else if(temp1!=null && temp2 == null)
	    temp3.next = temp1;
	    
	    
	    
	    return headC;
	        
	    }
	    
	}
	
	
}
