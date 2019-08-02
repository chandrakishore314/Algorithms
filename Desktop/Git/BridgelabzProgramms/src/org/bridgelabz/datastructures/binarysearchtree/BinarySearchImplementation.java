package org.bridgelabz.datastructures.binarysearchtree;

public class BinarySearchImplementation {
	BSTNode root = null;

	void insert(int data) {
		root = add(root, data);
	}

	public static BSTNode add(BSTNode root, int data) {

		if (root == null) {
			BSTNode bst = new BSTNode(data);
			root = bst;
			return root;
		} else if (data < root.data) {
			root.left = add(root.left, data);
		} else {
			root.right = add(root.right, data);
		}
		return root;
	}

	void inOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
	}

	public void display() {
		BinarySearchImplementation bst = new BinarySearchImplementation();
		bst.inOrder(root);
	}
}
