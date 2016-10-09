import java.util.*;
/*
	The goal is to check whether or not an input is prime or not. Print 'FALSE' if it's not, 
	'TRUE' if it is.
*/
public class primeCheck
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = scan.nextInt();
		boolean prime = true;
		for(int i = 2; i<number/2;i++)
		{
			System.out.println(number + " % " + i + " = " + number%i);
			if(number%i==0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
}