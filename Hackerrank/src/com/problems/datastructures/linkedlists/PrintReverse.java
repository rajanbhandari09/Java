package com.problems.datastructures.linkedlists;

import java.util.Stack;

/*Print all the elements of a Linked List in reverse order 
 Either of 2 approaches can be used - Recursion or Stacks
*/

public class PrintReverse {

	static Node head = null;
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			head = insertNodeAtTail(head, i);
		}
		
		printReverseOrder(head);
		
		
		//printReverseOrderRecursiveMethod(head);

	}
	
	//Recursive Approach
	/*private static void printReverseOrderRecursiveMethod(Node head2) {
		if(head2==null);
		else{
			printReverseOrderRecursiveMethod(head2.next);
			System.out.println(head2.data);
		}
		
		
	}*/


	private static void printReverseOrder(Node head2) {
		Stack elements = new Stack();
		Node temp = head2;
		while(temp!=null){
			elements.push(temp.data);
			temp = temp.next;
			
		}
		
		while(!elements.isEmpty()){
			System.out.println(elements.pop());
			
			
		}
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
