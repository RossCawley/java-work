import java.util.*;
/*
	Write a recursive method that takes in an integer n and outputs !n
*/
public class recFactorial
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
		
	}
	public static int factorial(int n)
	{
		
		if(n==1)
			return 1;
		else
			return factorial(n-1)*n;
	}
}