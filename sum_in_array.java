package achievers;

import java.util.Scanner;

public class sum_in_array {
	
	void get_pair(int arr[],int arr1[],int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]+arr1[j]==k)
				{
					System.out.println(arr[i]+" "+arr1[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		sum_in_array obj=new sum_in_array();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of elements in first array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		
		System.out.println("enter the number of elements in second array");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        
        System.out.println("enter the sum");
        int k=sc.nextInt();
        
        System.out.println("enter the first array");
        for(int i=0;i<n;i++)
        {
        	arr1[i]=sc.nextInt();
        }
        
        System.out.println("enter the second array");
        for(int i=0;i<m;i++)
        {
        	arr2[i]=sc.nextInt();
        }
		
        obj.get_pair(arr1,arr2,k);
				
	}

}
