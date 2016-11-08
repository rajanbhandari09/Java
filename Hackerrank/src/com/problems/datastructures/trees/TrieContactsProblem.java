package com.problems.datastructures.trees;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Trie{
    
    Node root;
    
    class Node{
        HashMap<Character,Node> children;
        Boolean isLeaf;
        int value;
        public Node(){
            children = new HashMap<>();
            isLeaf = false;
            value = 0;
            
        }
        
        
    }
    
    public Trie(){
        root = new Node();
        
        
    }
    
    public void Insert(String s){
        Node node = root;
        for(int i=0;i<s.length();i++){
                        
            if(node.children.containsKey(s.charAt(i))){
                
                node = node.children.get(s.charAt(i));
            }
            
            else{
                
                node.children.put(s.charAt(i),new Node());
                node = node.children.get(s.charAt(i));
                
            }
            
            node.value++;
        }
        
        node.isLeaf = true;
        
        
        
    }
    
    public int Search(String s){
        Node node = root;
        
        for(int i=0;i<s.length();i++){
            
            if(node.children.containsKey(s.charAt(i))){
                node = node.children.get(s.charAt(i));
                
                
                
            }
            
            else{
                return 0;
                
            }
            
            
            
        }
        
        return node.value;
        
        
        
        
    }
    
    public int findNumberOfWords(Node node){
    ArrayList<Node> nodes = new ArrayList<Node>(node.children.values());
        int numberOfWords = 0;
        if(nodes==null)
            return numberOfWords;
        
        for(int i=0;i<nodes.size();i++){
            if(nodes.get(i).isLeaf)
                numberOfWords++;
            
                numberOfWords += findNumberOfWords(nodes.get(i));
                
            
            
            
        }
        
        return numberOfWords;
        
        
    }
    
}
public class TrieContactsProblem {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Trie contactsTree = new Trie();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if(op.equals("add")){
                
                contactsTree.Insert(contact);
                
            }
            
            else if(op.equals("find")){
                System.out.println(contactsTree.Search(contact));
                
                
            }
                
        }
    }
}
