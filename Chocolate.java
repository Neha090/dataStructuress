package december;

import java.util.Scanner;

class Chocolate
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,temp=0;
System.out.println("Enter size :");
int n=sc.nextInt();
System.out.println("Enter array :");
int arr[]=new int[n];
	for( i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();
	}
System.out.println("Enter the number of students ");
int s=sc.nextInt();
	for( i=0;i<n-1;i++)
	{
		for( j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			arr[j]=arr[j]+arr[j+1];
 			arr[j+1]=arr[j]-arr[j+1];
    			arr[j]=arr[j]-arr[j+1];
			}
		}
	}	
	j=1000;
	for(i=0;i<n-s+1;i++)
	{
		if((arr[i+s-1]-arr[i]) < j)
		{
			j=(arr[i+s-1]-arr[i]);
			temp=i;
		}
	}
	for(i=0;i<s;i++)
	System.out.println(arr[i+temp]);
	
}
}