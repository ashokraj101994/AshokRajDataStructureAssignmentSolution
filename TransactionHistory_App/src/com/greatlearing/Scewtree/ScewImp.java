package com.greatlearing.Scewtree;


public class ScewImp {
	public static Node node;
	static Node head;
	static Node temp;
	
	public static void makeScewedTree(Node root) {
		if(root==null) {
			return;
		}
		else {
			makeScewedTree(root.left);
		}
		Node rightNode = root.right;
	    
	    if(head==null) {
	    	head=root;
	    	head.left=null;
	    	temp=root;
	    }
	    else {
	    	temp.right=root;
	    	root.left=null;
	    	temp=root;
	    	}
	    makeScewedTree(rightNode);
}
	public static void PrintRightScewedTree(Node root) {
		if(root==null) {
			return;
		}
		else {
			System.out.print(root.key + "---->");
			PrintRightScewedTree(root.right);
		}
	}
	public static void main(String[] args) {
		
		  ScewImp tree=new ScewImp();
		  tree.node = new Node(50);
		  tree.node.left = new Node(30);
		  tree.node.right = new Node(60);
		  tree.node.left.left = new Node(10);
		  tree.node.right.left= new Node(55);
		  
		  ScewImp.makeScewedTree(node);
		  System.out.println("Right scewed tree is which is not having left node");
		  System.out.println(" ");
		  PrintRightScewedTree(head);
		  System.out.print("End  ");
		
   }

}
