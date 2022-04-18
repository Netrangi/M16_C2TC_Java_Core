package in.cg.recursion;

import java.util.Scanner;

public class Fibonacci {
	static int Fibonacci(int n)
	{
	    if(n==0)
	        return 0;
	    else if(n==1)
	        return 1;
	    else
	        return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n;
	    System.out.print("Enter the N value:");
	    n=s.nextInt();
	    System.out.print("Nth Fibonacci Number is: "+ Fibonacci(n));
        s.close();

	}

}
