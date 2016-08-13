package com.problems.datastructures.trees;

/* Notes:
Height of a binary tree = 1+ Maximum(Height of left subtree, Height of right subtree)
Height of an empty subtree = -1
*/

public class BinaryTreeHeight{
	
	public static int getHeight(Node root){

		if(root==null)
			return -1;
		else
			return 1+Math.max(getHeight(root.left),getHeight(root.right));

	}



}