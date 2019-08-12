package org.bridgelabz.functional.utility.datastructures;

import org.bridgelabz.functional.utility.datastructures.BSTNode;;

public class BinarysearchTree<T extends Comparable<T>>{

BSTNode<T> root = null;
	
//To add a New Node to Binary search Tree
	public void insert(T data) {
		BSTNode<T> newBsn = new BSTNode<T>(data);
		BinarysearchTree<T> BinarysearchTree=new BinarysearchTree<T>();
		root = BinarysearchTree.add(root, newBsn);
	}

// To add a New Node to Binary search Tree
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
	// To display Binary search Tree Values
	  void display(BSTNode<T> node) {
		if (root == null) {
			return;
		}
		display(node.left);
		System.out.printf("%s ", node.data);
		display(node.right);
	}
	// To display Binary search Tree Values
	public void inOrder() {
		BinarysearchTree<T> BinarysearchTree=new BinarysearchTree<T>();
		BinarysearchTree.display(root);
	}}

