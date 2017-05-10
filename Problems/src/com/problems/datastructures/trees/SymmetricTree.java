package com.problems.datastructures.trees;

import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

//Iterative Approach
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
        return true;
        
        Deque<TreeNode> nodes = new LinkedList<>();
        nodes.addLast(root.left);
        nodes.addLast(root.right);
        
        while(!nodes.isEmpty()){
            
            TreeNode left = nodes.removeFirst();
            TreeNode right = nodes.removeFirst();
            
            
            if(left==null&&right!=null)
            return false;
            
            else if(left!=null&& right==null)
            return false;
            
            
            else if(left!=null&&right!=null){
                if(left.val!=right.val)
                return false;
                
                else{
                    
                    
                    nodes.addLast(left.left);
                    nodes.addLast(right.right);
                    nodes.addLast(left.right);
                    nodes.addLast(right.left);
                    
                }
                
                
                
                
            }
            
            
        }
        
        return true;
    }
    

}

//Recursive Approach
/*
 public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        return isSymmetric(root.left,root.right);
        
        
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        boolean result;
        if(left==null&&right==null)
        return true;
        
        else if(left==null||right==null)
        return false;
        
        else if(left.val!=right.val)
        return false;
        
        else{
            
            result = isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
            
            
            
        }
        return result;
    }
}
 */
















