/*Class FindMergePoint contains method FindMergeNode which takes as input 2 linked list heads
 * and returns the data value of their merging node. */

package com.problems.datastructures.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class FindMergePoint {
	int FindMergeNode(Node headA, Node headB) {
	    Node temp1 = headA;
	    Node temp2 = headB;
	    
	    List<Node> visited = new ArrayList<Node>();
	    while(temp1!=null){
	        visited.add(temp1);
	        temp1 = temp1.next;
	        
	        
	    }
	    
	    while(temp2!=null){
	        if(visited.contains(temp2))
	            return temp2.data;
	        else
	            temp2 = temp2.next;        
	    }
	return 0;
	}
}
