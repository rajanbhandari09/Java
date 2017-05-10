package com.problems.datastructures.trees;

public class IsBinarySearchTree {
	class Node {
        int data;
        Node left;
        Node right;
     }


public static Node prevNode =null;
    boolean checkBST(Node root) {
                
        boolean flag = true;
        return preOrderTraversal(root,flag);
        
   }

public static boolean preOrderTraversal(Node node, boolean flag){
    
    
    if(node.left!=null){
        flag =  preOrderTraversal(node.left,flag);
        
    }
    
    if(prevNode!=null&&prevNode.data>=node.data)
        flag = false;
    
    prevNode = node;
    
    if(node.right!=null){
        
        flag = preOrderTraversal(node.right,flag);
        
    }
    
    return flag;
    

}
}
