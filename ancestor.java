package achievers;

import java.util.Scanner;

public class ancestor {
	
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
	
	ancestor()
	{
		root=null;
	}
	
	Node get_ancestor(Node node,int p,int q)
	{
		if(root == null){
            return null;
        }if((p == root.data) || (q == root.data)){
            return root;
        } 
        Node left = get_ancestor(root.left,p,q);
        Node right = get_ancestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        
        Node ancestor = ((left == null) ? right : left);
        return ancestor;
        
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ancestor tree=new ancestor();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		tree.get_ancestor(tree.root,a,b);


		
		
	}

}
