/*This java file defines 2 classes:
 * a) Node - defines structure of a singly linked list node
 * b) LinkedListOperations - defines operations like creation, insertion, deletion
 * and traversal in a linked list 
 * */

package com.problems.datastructures.linkedlists;

import java.util.Scanner;

//Linked List Node structure
class Node{
	int data;
	Node next;
}


public class LinkedListOperations {
static Node head = null;
static int input;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condition = true;
		while(condition){
		System.out.println("Enter your choice:");
		System.out.println("1: Insert node at the tail of Linked List");
		System.out.println("2: Insert node at the head of Linked List");
		System.out.println("3: Insert node at the specified position of Linked List");
		System.out.println("4: Delete node at the specified position of Linked List");
		System.out.println("5: Print data of all nodes");
		System.out.println("6: Exit");
		
		
		
		
		input = sc.nextInt();
		
		
		
		switch(input){
		
		case 1: System.out.println("Enter the number to be inserted:");
		head = insertNodeAtTail(head, sc.nextInt());
		break;
		
		case 2: System.out.println("Enter the number to be inserted:");
		head = insertNodeAtHead(head, sc.nextInt());
		break;
		
		case 3: System.out.println("Enter the number and position in Linked List");
		head = insertNodeAtPosition(head, sc.nextInt(),sc.nextInt());
		break;
		
		case 4: System.out.println("Enter the position in Linked List");
		head = deleteNodeAtPosition(head, sc.nextInt());
		break;
		
		case 5: printNodesData(head);
		break;
		
		case 6: condition = false;
		break;
		
		}
		
		}

	}
private static Node deleteNodeAtPosition(Node head2, int nextInt) {
		if(nextInt == 0){
			head2 = head2.next;
			
		}
		
		else{
			Node temp1 = head2;
			Node temp2 = head2;
			for(int i=0;i<nextInt;i++){
				temp2 = temp1;
				temp1 = temp1.next;
				
			}
			temp2.next = temp1.next;
			temp1 = null;
			
		}
		return head2;
	}
private static Node insertNodeAtPosition(Node head2, int nextInt, int nextInt2) {
		if(nextInt2 == 0){
			insertNodeAtHead(head2, nextInt);
			
		}
		else{
			Node temp;
			Node temp1 = head2;
			Node temp2 = head2;
			for(int i=0;i<nextInt2;i++){
				temp2 = temp1;
				temp1 = temp1.next;
				
			}
			
			temp = new Node();
			temp.data = nextInt;
			temp.next = temp1;
			temp2.next = temp;
		}
		return head2;
	}
private static Node insertNodeAtHead(Node head2, int nextInt) {
	
	Node temp;
		if(head2 == null){
			head2 = new Node();
			head2.data = nextInt;
			head2.next = null;
			
		}
		
		else{
			temp = new Node();
			temp.data = nextInt;
			temp.next = head2;
			head2 = temp;
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

//Traversal Operation
	private static void printNodesData(Node head2) {
		
		Node currentNode = head2;
		
		if(currentNode==null){
			System.out.println("List Empty");
		}
		else{
			while(currentNode!=null){
				System.out.print(currentNode+"->");
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
				
			}
			
		}
	}
	
	

	

	

}
