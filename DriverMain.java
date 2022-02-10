package com.greatlearning.dsa.ass3.bst.main;

import com.greatlearning.dsa.ass3.bst.service.Transaction;
import com.greatlearning.dsa.ass3.bst.service.Node;

public class DriverMain {

	public static void main(String[] args) {
		Transaction tree = new Transaction();
		
    	tree.node = new Node(50);
    	tree.node.left = new Node(30);
    	tree.node.right = new Node(60);
    	tree.node.left.left = new Node(10);
    	tree.node.right.left= new Node(55);
       
        int order = 0;
        tree.binaryToSkewed(tree.node, order);
        tree.rightSkewed(tree.headNode);

	}

}
