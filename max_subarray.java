package achievers;
/*Given an array of n elements and an integer k. The task is to find the count of subarray which has maximum element greater than K.

Input : arr[] = {1, 2, 3} and k = 2.
Output : 3
Explanation : All the possible subarrays of arr[] are 
{ 1 }, { 2 }, { 3 }, { 1, 2 }, { 2, 3 }, 
{ 1, 2, 3 }.
Their maximum elements are 1, 2, 3, 2, 3, 3.
There are only 3 maximum elements > 2.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class max_subarray {
	
	ArrayList<Integer> list=new ArrayList<>();
	int count=0;
	
	void getMax(int arr[],int k)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int max=0;
			for(int j=i;j<n;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
		  list.add(max);
		}
		get_count(list,k);
		
	}
	
	void get_count(ArrayList<Integer> list,int k)
	{
		Collections.sort(list);
		list.forEach(item->{
			if(item>k)
			{
				count++;
			}
		});
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		
		max_subarray obj=new max_subarray();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of elements");
		int num=sc.nextInt();
		int arr[]=new int[num];
		
		System.out.println("enter elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter elements");
		int k=sc.nextInt();
		
		obj.getMax(arr,k);
		
	}

}
