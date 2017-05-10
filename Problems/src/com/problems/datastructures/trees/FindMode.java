package com.problems.datastructures.trees;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FindMode {
    int maxCount = 0;
    int numberOfModes = 0;
    int valueCount = 0;
    int previousNodeValue = 0;
    int[] modes;
    
    public int[] findMode(TreeNode root) {
        
    //1st pass to find the maxCount and number of modes    
    inOrder(root);
    
    
    modes = new int[numberOfModes];
    
    //2nd pass to find the modes
    valueCount = 0;
    previousNodeValue = 0;
    inOrder(root);
    
    return modes;
    
    
        
        
    }
    
    public void handleNode(TreeNode node){
        if(node.val!=previousNodeValue){
            valueCount = 0;
            previousNodeValue = node.val;
        }
        valueCount++;
        
        if(valueCount>maxCount){
            
            maxCount = valueCount;
            numberOfModes=1;
            
            
        }
        
        else if(valueCount==maxCount){
            if(modes!=null){
                modes[numberOfModes-1]=node.val;
                numberOfModes--;
            }
            else
            numberOfModes++;
        }
        
    }
    
    public void inOrder(TreeNode node){
        if(node==null)
        return;
        else{
            inOrder(node.left);
            handleNode(node);
            inOrder(node.right);
            
        }
        
        
        
    }
}
