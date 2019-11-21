package achievers;

import java.util.Scanner;

public class array {
	
	
	void highest(int arr[],int k)
	{
		for(int i=0;i<arr.length-k+1;i++)
		{
			
			int max=0;
			for(int j=i;j<i+k;j++)
			{
				
				if(arr[j]>max)
					max=arr[j];
			}
			
			
			System.out.print(max+" ");
		}
	}
	public static void main(String[] args) {
		
		array obj=new array();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of elelments");
		int n=sc.nextInt();
		System.out.println("enter the number to make subarray");
		int k=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		obj.highest(arr,k);
				
	}

}
