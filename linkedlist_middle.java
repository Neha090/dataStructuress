package december;

import java.util.Scanner;

public class linkedlist_middle {
	
	static int size=0;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	Node root;
	
	linkedlist_middle()
	{
		root=null;
	}
	
	void insert(int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return;
		}
		
		Node temp=root;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=new Node(data);
		
	}
	
	void insert_middle(int data)
	{
		int s=size/2;
		Node temp=root;
		
		Node temp1=new Node(data);
		while(s>0)
		{
			temp=temp.next;
			s--;
		}
		
		temp1.next=temp.next;
		temp.next=temp1;
		
		
	}
	
	void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
	}
	
	public static void main(String[] args) {
		
		linkedlist_middle obj=new linkedlist_middle();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of terms");
		size=sc.nextInt();
		
		System.out.println("enter list elements");
		for(int i=0;i<size;i++)
		{
			obj.insert(sc.nextInt());
		}
		System.out.println("Enter the number to be added in the middle");
		int num=sc.nextInt();
		
		System.out.print("Before insertion :");
		obj.print();
		
		obj.insert_middle(num);
		
		System.out.println();
	    System.out.print("After insertion :");
		obj.print();
		
	}

}
