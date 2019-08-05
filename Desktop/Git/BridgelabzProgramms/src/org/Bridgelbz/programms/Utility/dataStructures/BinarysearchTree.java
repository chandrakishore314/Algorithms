package org.Bridgelbz.programms.Utility.dataStructures;

import org.Bridgelbz.programms.Utility.dataStructures.BSTNode;;

public class BinarysearchTree<T extends Comparable<T>>{

BSTNode<T> root = null;
	
	public void insert(T data) {
		BSTNode<T> newBsn = new BSTNode<T>(data);
		BinarysearchTree BinarysearchTree=new BinarysearchTree();
		root = BinarysearchTree.add(root, newBsn);
	}


	public  BSTNode<T> add(BSTNode<T> root,BSTNode<T> newBsn ) {
		if (root == null) {
			
			root = newBsn;
			return root;
		} else if ((root.data).compareTo(newBsn.data)>0) {
			root.left = add(root.left, newBsn);
		} else {
			root.right = add(root.right, newBsn);
		}
		return root;
	}
	  void display(BSTNode node) {
		if (root == null) {
			return;
		}
		display(node.left);
		System.out.printf("%s ", node.data);
		display(node.right);
	}
	public void inOrder() {
		BinarysearchTree BinarysearchTree=new BinarysearchTree();
		BinarysearchTree.display(root);
	}}

