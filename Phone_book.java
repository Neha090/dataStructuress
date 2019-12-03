package december;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Phone_book {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of records");
		int n=sc.nextInt();
		String s[]=new String[n];
		
		HashMap<String,Integer> map=new HashMap<>();
		
		
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("enter name:");
			String name=sc.nextLine();
			
			System.out.println("enter number");
			int num=sc.nextInt();
			map.put(name,num);
		}
		
		 sc.nextLine();
		  
	     for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			if(map.get(s[i])==null)
                System.out.println("Not Found");  
			
			else
			System.out.println("Name : "+s[i]+"\nPhone Number : "+map.get(s[i]));
			
			System.out.println();
		}
		
		
	}

}
