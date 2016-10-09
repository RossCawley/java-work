import java.util.*;
/*
	The goal is to read in a number N and output the nth prime numbe. For
	example, if N is 3, output 5 since 5 is the third prime number.
*/
public class nthPrime
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), counter = 0,found= 0;
		boolean prime = true;
		for(int i = 2; i < 10000;i++)
		{
			prime = true;
			for(int j = 2; j<=i/2; j++)
			{
				if(i%j==0 && i!=j)
				{					
					prime = false;
				}
			}
			if(prime)
			{
				counter++;
				//System.out.print(i + "   ");
				if(counter==n)
				{
					found = i;
					break;
				}
			}
		}
		System.out.println(found);
	}
}