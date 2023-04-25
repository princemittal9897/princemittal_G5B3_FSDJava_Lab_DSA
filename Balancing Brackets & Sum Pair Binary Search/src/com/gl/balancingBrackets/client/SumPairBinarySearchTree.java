package com.gl.balancingBrackets.client;


import java.util.HashSet;
import java.util.Set;

public class SumPairBinarySearchTree {
	class Node {
		int val;
		Node left, right;

		Node(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
	
private Node root;

public SumPairBinarySearchTree(){
	root = null;
}
public void insert(int val) {
	root = insert(root,val);

}
private Node insert(Node node, int val) {
	if(node == null)
		return new Node(val);
	if (val<node.val)
		node.left = insert(node.left,val);
	else
		node.right = insert(node.right,val);
	return node;
}
public boolean findPairWithSum(int sum) {
	Set<Integer> set = new HashSet<>();
	return findPairWithSum(root,sum, set);
}



private boolean findPairWithSum(Node node, int sum, Set<Integer> set) {
	if(node == null) {
		return false;
	}
	if(findPairWithSum(node.left, sum, set)) {
		return true;
	}
	if(set.contains(sum - node.val)) {
		System.out.println("Pair found for "+ sum +" :: "+ (sum - node.val) + " , "+ node.val);
		return true;
	}
	set.add(node.val);
	return findPairWithSum(node.right, sum, set);
}


public static void main(String[] args) {
	SumPairBinarySearchTree tree = new SumPairBinarySearchTree();
	tree.insert(40);
	tree.insert(20); 
	tree.insert(60); 
	tree.insert(10); 
	tree.insert(30);
	tree.insert(50);
	tree.insert(70);
	
	int sum1 = 20;
	
	if(!tree.findPairWithSum(sum1)) {
		System.out.println("Nodes not found for sum " + sum1);
	}
	
	int sum2 = 60;
	
	if(!tree.findPairWithSum(sum2)) {
		System.out.println("Nodes not found for sum " + sum1);
	}
}
}
