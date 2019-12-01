package achievers;

import java.util.Scanner;

public class linkedlist_palindrome {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node root;
	
	linkedlist_palindrome()
	{
		root=null;
	}
	
	void insert_front(int num)
	{
		if(root==null)
			root=new Node(num);
		
		else
		{
		Node temp=new Node(num);
		temp.next=root;
		root=temp;
		}
	}
	
	void insert(int num)
	{
		
		Node temp=new Node(num);
			if(root==null)
			{
				root=temp;
				return;
			}
			
		Node temp1=root;

				while(temp1.next!=null)
				{
				     temp1=temp1.next;	
				}
				
				temp1.next=temp;
			
				
	}
	
	void check_palindrome(Node root1,Node root2,int n)
	{
		int count=1;
		
		while(root1.next!=null)
		{
			if(root1.data==root2.data)
			{
				count++;
			}
			root1=root1.next;
			root2=root2.next;
		}
		
		if(count==n)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		linkedlist_palindrome obj=new linkedlist_palindrome();
		linkedlist_palindrome obj1=new linkedlist_palindrome();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			obj.insert(num);
			obj1.insert_front(num);
			
		}
		
		obj.check_palindrome(obj.root,obj1.root,n);
		
	}

}
