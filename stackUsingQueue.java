package december;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stackUsingQueue {
	
	static class Stack
	{
		static int size=0;
		static Queue q1=new LinkedList<Integer>();
		static Queue q2=new LinkedList<Integer>();
		Stack()
		{
			size=0;
		}
		static void push1(int a)
		{
			size++;
			q2.add(a);
			
			while(!q1.isEmpty())
			{
				q2.add(q1.poll());
			}
			
			Queue<Integer> q=q1;
			q1=q2;
			q2=q;
		}
		static int size()
		{
			return size;
		}
		static int top()
		{
			if(q1.isEmpty())
				return -1;
			return (int)q1.peek();
		}
		static void pop()
		{
			if(q1.isEmpty())
				return;
			q1.remove();
			size--;	
		}
	}
	public static void main(String args[])
	{
		Stack q=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			q.push1(sc.nextInt());
		}
		
		System.out.println("size : "+q.size());
		System.out.println("top: "+q.top());
		q.pop();
		System.out.println("top : "+q.top());
	}
}