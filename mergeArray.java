package december;

import java.util.*;

public class mergeArray {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of elemmnts of first array ");
		
		int num = sc.nextInt();
		
		int ar[]=new int[num];
		
		System.out.println("Enter elements of first array ");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	
		System.out.println("Enter size of second array");
		
		int s2 = sc.nextInt();
		
		int ar2[] =new int[s2];
		
		System.out.println("Enter elements of second arry");
		
		for(int i=0;i<s2;i++)
		{
			ar2[i]=sc.nextInt();
		}
		
		mergesortedarray(ar,ar2);
	
	
		}

		static void mergesortedarray(int ar1[],int ar2[])
		{
	
			int s1 = ar1.length;
			
			int s2 = ar2.length;
			
			int s = s1+s2;
			
			int arr[] =new int[s];
			
			int i=0,j=0,k=0;
			
			while(i<s1 && j<s2)
			{
				
				if(ar1[i]<=ar2[j])
				{
					arr[k]=ar1[i];
					i++;
					k++;
				}
				
				else 
				{
					arr[k]=ar2[j];
					j++;
					k++;
				}
			}
				while(i<s1)
				{
					arr[k]=ar1[i];
					i++;
					k++;
				}
				
				while(j<s2)
				{
					arr[k]=ar2[j];
					j++;
					k++;
				}
			
			for(int m=0;m<s;m++)
				System.out.print(arr[m]+" ");
		
			
		}

}