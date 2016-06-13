/*Class CycleDetection contains method hasCycle which takes as input head of a linked list
 * and identifies whether the linked list contains a cycle or not. It returns true if a cycle
 * is present else it returns false. */

package com.problems.datastructures.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
	boolean hasCycle(Node head) {
	    if(head == null)
	        return false;
	    else{
	        Node temp = head;
	        List<Node> visited = new ArrayList<Node>(); 
	while(temp!=null){
	    
	    if(visited.contains(temp))
	        return true;
	    
	    else{
	        visited.add(temp);
	        temp = temp.next;
	    }
	    
	}
	    return false;
	    
	    }
	}
}
