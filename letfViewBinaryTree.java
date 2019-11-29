package achievers;
import java.util.ArrayDeque;
import java.util.Queue;

public class letfViewBinaryTree {
	
	static class Node
	{
		int key;
		Node left = null, right = null;

		Node(int key) {
			this.key = key;
		}
	}
	
	Node root;
		
		public static void leftView(Node root)
		{
			
			if (root == null) {
				return;
			}

			Queue<Node> queue = new ArrayDeque<>();
			queue.add(root);

			Node curr;
			while (!queue.isEmpty())
			{
				int size = queue.size();
				int i = 0;
				while (i++ < size) {
					curr = queue.poll();
					if (i == 1) {
						System.out.print(curr.key + " ");
					}

					if (curr.left != null) {
						queue.add(curr.left);
					}

					if (curr.right != null) {
						queue.add(curr.right);
					}
				}
			}
		}
		public static void main(String[] args)
		{
			letfViewBinaryTree tree=new letfViewBinaryTree();
			
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);
			tree.root.left.right = new Node(4);
			tree.root.right.left = new Node(5);
			tree.root.right.right = new Node(6);
			tree.root.right.left.left = new Node(7);
			tree.root.right.left.right = new Node(8);

			leftView(tree.root);
		}
	}

