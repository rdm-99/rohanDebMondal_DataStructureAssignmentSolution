package com.greatlearning.dsa.ass3.bst.service;

public class Transaction {
	public Node node;
    public Node prevNode = null;
    public Node headNode = null;
    
    public void binaryToSkewed(Node root,int order) {
    	if(root == null) {
    		return;
    	}
    	if(order>0) {
    		binaryToSkewed(root.right, order);
    	}
    	else {
    		binaryToSkewed(root.left, order);
    	}
    	Node rightNode = root.right;
    	Node leftNode = root.left;
    	if(headNode==null) {
    		headNode = root;
    		root.left=null;
    		prevNode=root;
    	}
    	else {
    		prevNode.right = root;
    		root.left=null;
    		prevNode=root;
    	}
    	if(order>0) {
    		binaryToSkewed(leftNode, order);
    	}
    	else {
    		binaryToSkewed(rightNode, order);
    	} 	
    }
    public void rightSkewed(Node root) {
    	if(root==null) {
    		return;
    	}
    	System.out.print(root.data +" ");
    	rightSkewed(root.right);
    }
}
