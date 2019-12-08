package december;

import java.util.Scanner;

public class leafNode {
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	
	leafNode()
	{
		root=null;
	}
	
	void insert(int data)
	{
		root=insert_node(root,data);
	}
	
	Node insert_node(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		
		if(data<root.data)
		{
			root.left=insert_node(root.left,data);
		}
		
		else
		{
			root.right=insert_node(root.right,data);
			
		}
		
		return root;
			
	}
	
	void printLeafNode(Node root)
	{
		if (root == null)
		{
			return; 
		} 
		if (root.left == null && root.right == null) 
		{ 
			System.out.println(root.data); 
		}
			
		printLeafNode(root.left);
		printLeafNode(root.right);

		
	}
	
	public static void main(String[] args) {
		
		leafNode obj=new leafNode();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			obj.insert(sc.nextInt());
		}
		
		System.out.println("Leaf Nodes");
		obj.printLeafNode(obj.root);
		
		
	}

}
