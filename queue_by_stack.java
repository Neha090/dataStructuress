package december;
import java.util.*;

public class queue_by_stack {
	
	static int size=0;
	static Stack<Integer> s1=new Stack();
	static Stack<Integer> s2=new Stack();
	
	static void enqueue(int x)  
    {  
		size++;
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
        }   
        s1.push(x);   
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());  
        }  
    }  
 
    static int dequeue()  
    {    
        if (s1.isEmpty())  
        {  
            System.out.println("Queue is Empty");   
        }  
        
        int x = s1.peek();  
        s1.pop();  
        return x;  
    } 
    
    static int size()
    {
    	return size;
    }
    
	public static void main(String[] args) {
		
		queue_by_stack  obj=new queue_by_stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		
		System.out.println("enter elelments");
		for(int i=0;i<n;i++)
		{
			obj.enqueue(sc.nextInt());
		}
		
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println("size : "+obj.size());
	}
	

}
