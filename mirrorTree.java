package december;

import java.util.*;

class Node{
	
	Node left,right;
	int key;
	
	Node(int item){
		key=item;
		left=right=null;
	}
}

public class mirrorTree {
	
	static Node root;
	
	mirrorTree()
	  {
		root=null;
	  }
	
	mirrorTree(int key)
	  {
		root =new Node(key);
	  }
	
	boolean check(Node root,Node root1)
	{
		if(root1==null && root==null)
			return true;
		if(root!=null && root1!=null && root.key==root1.key)
			return (check(root.left,root1.right) && check(root.right,root1.left));
		return false;
		
	}
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		mirrorTree tree=new mirrorTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(3);
		boolean output=tree.check(root,root);
		if(output==true)
			System.out.print("Tree is Mirror of itself");
		else
			System.out.print("Tree is not Mirror of itself");
	}
}