import java.util.*;
/*
	The goal is to read a number and compute the nearest prime. If two primes are equidistant print the lower one.
*/
public class closestPrime
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please read in a number:");
		int number = scan.nextInt(), higherPrime = 0, lowerPrime = 0, counter1 = 0, counter2 = 0;
		boolean found = false, prime=true;
		while(!found)
		{
			//System.out.println("A");
			for(int i = number; i < number*2;i++)
			{
				//System.out.println("Number: " + i);
				//System.out.println("B");
				for(int j = 2; j<number/2;j++)
				{
					if(prime)
					{
						//System.out.println("C");
						if(i%j==0)
						{
							//System.out.println("D");
							prime = false;
						}
					}
					
				}
				//System.out.println("E");
				if(prime)
				{
					//System.out.println("F");
					//System.out.println(i + " is prime!");
					higherPrime=i;
					i = number*2;
				}
				counter1++;
				prime = true;
			}
			for(int i = number; i > 0;i--)
			{
				//System.out.println("Number: " + i);
				//System.out.println("B");
				for(int j = 2; j<number/2;j++)
				{
					if(prime)
					{
						//System.out.println("C");
						if(i%j==0)
						{
							//System.out.println("D");
							prime = false;
						}
					}
					
				}
				//System.out.println("E");
				if(prime)
				{
					//System.out.println("F");
					//System.out.println(i + " is prime!");
					lowerPrime = i;
					i = 0;
				}
				counter2++;
				prime = true;
			}
			//System.out.println("G");
			found = true;
		}
		if (counter1 < counter2)
		{
			System.out.println(higherPrime + " is the closest prime to " + number);
		}
		else 
		{
			System.out.println(lowerPrime + " is the closest prime to " + number);
		}
	}
}