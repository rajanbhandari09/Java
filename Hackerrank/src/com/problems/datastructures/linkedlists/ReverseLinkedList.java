package com.problems.datastructures.linkedlists;

import java.util.Stack;

public class ReverseLinkedList {

	static Node head = null;
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			head = insertNodeAtTail(head, i);
		}
		printNodes(head);
		head = Reverse(head);
		printNodes(head);
		
		

	}
	private static void printNodes(Node head2) {
		Node temp = head2;
		while(temp!=null){
			System.out.println(temp);
			temp = temp.next;
		}
		
	}
	//Recursive Implementation
	/*Node Reverse(Node head) {
	    Node temp = head;
	    
	    if(head.next==null){
	        return head;
	    }
	else if(head.next.next==null){
	    temp = head.next;
	    head.next.next = head;
	    head.next = null;
	    return temp;
	}
	    else {
	   head = Reverse(temp.next);
	    temp.next.next = temp;
	        temp.next = null;
	    return head;
	    }
	    
	}*/
	//Stack Implementation
	private static Node Reverse(Node head2) {
		Node temp = head2;
		if(temp!=null){
			Stack s = new Stack();
			while(temp!=null){
				s.push(temp);
				temp = temp.next;		
				
				
			}
			head2 = (Node)s.pop();
			temp = head2;
			while(!s.isEmpty()){
				
				temp.next = (Node)s.pop();
				temp = temp.next;
				
				
			}
			temp.next = null;
			
			
		}
		
		return head2;
	}
	
	
	

	private static Node insertNodeAtTail(Node head3, int i) {
		Node tail = head3;
		
		//If linked list is empty
			if(head3 == null){
				//Creating a single node
				head3 = new Node();
				head3.data = i;
				head3.next = null;
			}
			//If linked list is not empty
			else{
				while(tail.next!=null){
					tail = tail.next;
					
				}
				//Adding a node to the end of current linked list
				tail.next = new Node();
				tail.next.data = i;
				tail.next.next =null;
			}
			return head3;
		}

}
