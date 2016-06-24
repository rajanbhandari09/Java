class Node {
     int data;
     Node next;
  }


class FindElementFromEnd {    
    
int GetNode(Node head,int n) {
     Node current = head;
    Node runner = head;
    for(int i=0;i<n;i++){
        runner=runner.next;
        
    }
    
    while(runner.next!=null){
        current = current.next;
        runner = runner.next;
        
        
    }
    
    return current.data;


}

}