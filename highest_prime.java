package december;

import java.util.*;

public class highest_prime {
	
	ArrayList<Integer> list=new ArrayList<>();
	int size=1;
	
	void get_multiples(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if((num%i)==0)
			{
				check_prime(i);
			}
		}
	}
	
	void check_prime(int num)
	{
		int count=0,number=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				break;
			
			else
				count++;
		}
		
		if(count==0)
		{
			size++;
			number=num;
		}
		
		list.add(number);
		
	}
	
	void print()
	{
		Collections.sort(list);
		System.out.println("Highest Prime Multiple : "+list.get(size));
	}
	
	public static void main(String[] args) {
		
		highest_prime obj=new highest_prime();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to get highest prime :");
		int num=sc.nextInt();
		
		obj.get_multiples(num);
		obj.print();
		
	}

}
