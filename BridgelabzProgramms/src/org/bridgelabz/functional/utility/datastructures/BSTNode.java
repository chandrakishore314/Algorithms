package org.bridgelabz.functional.utility.datastructures;

public class BSTNode<T> {
	BSTNode<T> left ;
	BSTNode<T> right;
  T data ;
    
  public  BSTNode(T data){
    	 this.data=data;
    	this.right = null;
    	this.left = null;
    }
	
}
