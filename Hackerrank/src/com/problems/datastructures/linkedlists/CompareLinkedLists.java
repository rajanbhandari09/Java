/*Compare Two Linked Lists:
 * Two Linked Lists are equal when they have same number of nodes 
 * and the corresponding data elements of nodes are equal
 * The code returns value 1 when linked lists are equal else it returns 0
 * Two approaches can be used - 1) Normal If/Else logic 2)Recursion
*/


package com.problems.datastructures.linkedlists;

public class CompareLinkedLists {
	static Node head1 = null;
	static Node head2 = null;
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			head1 = insertNodeAtTail(head1, i);
			head2 = insertNodeAtTail(head2, i);
		}
		//Normal Approach
		System.out.println(compareLinkedLists(head1,head2));
		//Recursive Approach
		System.out.println(CompareLinkedListsRecursion(head1, head2));
		
		
		
		
	}
	
	//Recursive Approach
	private static int CompareLinkedListsRecursion(Node head12, Node head22) {
		
		if(head12==null&&head22==null)
			return 1;
		
		if((head12==null&&head22!=null)||(head12!=null&&head22==null))
			return 0;
		
		if(head12.data!=head22.data)
			return 0;
		else{
			
			return CompareLinkedListsRecursion(head12.next,head22.next);
			
		}
		
		
	}
//Normal Approach
	private static int compareLinkedLists(Node head12, Node head22) {
		if(head12==null && head22==null)
			return 1;
					
		if(head12==null&&head22!=null)
			return 0;
		
		if(head12!=null&&head22==null)
		return 0;
		
		else{
			Node temp1 = head12;
			Node temp2 = head22;
			
		while(temp1!=null&&temp2!=null){
			if(temp1.data==temp2.data){
			temp1 = temp1.next;
			temp2 = temp2.next;
			}
			
			else{
				return 0;
				
			}
			
		}
			
			if(temp1!=null||temp2!=null)
				return 0;
			else
				return 1;
			
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
