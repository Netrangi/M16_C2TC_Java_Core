package in.cg.recursion;

import java.util.Scanner;

public class Sum 
{
	static int sod(int num)
	{
		if (num==0)
		{
			return 0;
		}
		else
			return num%10+sod(num/10);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sod(n)); //fun call
		s.close();


	}

}