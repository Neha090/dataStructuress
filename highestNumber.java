package december;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	      int n=Integer.parseInt(br.readLine());
	      String[] arr=br.readLine().split("\\s+");
	     
	     // int max=arr[0];
	       for(int i=0;i<n-1;i++)
	      {
	          for(int j=i+1;j<n;j++)
	          {
	              if(Integer.parseInt(arr[i]+arr[j])<Integer.parseInt(arr[j]+arr[i]))
	              {
	                  String temp=arr[i];
	                  arr[i]=arr[j];
	                  arr[j]=temp;
	              }
	          }
	      }
	      for(int i=0;i<n;i++)
	      System.out.print(arr[i]);
	      
	      System.out.println();
	     

}
}
}