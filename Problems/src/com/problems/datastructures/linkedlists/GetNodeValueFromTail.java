package com.problems.datastructures.linkedlists;

import java.util.Scanner;

public class GetNodeValueFromTail {
	static Node head = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			head = insertNodeAtTail(head, i);
		}
		int position = sc.nextInt();
		System.out.println();

	}
	
	private static void getValue(Node head2, int position) {
		
		
			
		
		
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
