package achievers;

import java.util.ArrayList;
import java.util.Collections;

public class binary_tree {
	
	ArrayList al=new ArrayList();
	ArrayList al1=new ArrayList();
	
	static class Node
	{
		int key;
		Node left,right;
		
		Node(int key)
		{
			this.key=key;
			right=left=null;
		}
	}
	
	Node root;
	
	binary_tree()
	{
		root=null;
	}
	
	binary_tree(int key)
	{
		root=new Node(key);
	}
	
	void check_bst(Node root)
	{
		if(root!=null)
		{
			check_bst(root.left);
			al.add(root.key);
			al1.add(root.key);
			check_bst(root.right);
		}
		
		
	}
	
	void check()
	{
		Collections.sort(al);
		if(al.equals(al1))
		{
			System.out.println("this is a bst");
		}
		else
		{
			System.out.println("not a bst");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		binary_tree tree=new binary_tree();
		tree.root=new Node(5);
		tree.root.left=new Node(3);
		tree.root.right=new Node(7);
		tree.root.left.left=new Node(2);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(6);
		
		tree.check_bst(tree.root);
		tree.check();		
		
		
	}
}
