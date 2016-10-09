import java.util.*;
/*
	The goal is to change a given number from one base to another.
*/

public class convertingBase
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base you'd like to convert from: ");
		int fromBase = scan.nextInt();
		System.out.println("Enter the base you'd like to convert to: ");
		int toBase = scan.nextInt();
		System.out.println("Enter the number you'd like to convert: ");
		int n = scan.nextInt();
		System.out.println("Converting " + n + " from Base " + fromBase + " to Base " + toBase + "...");
		int n10 = toBase10(n, fromBase);
		System.out.println(fromBase10(n10,toBase));
	}
	public static int toBase10(int number, int base)
	{
		String numberString = Integer.toString(number);
		int retVal = 0, i = 0, j = numberString.length()-1;
		while (j>=0)
		{
			int num = (int)(numberString.charAt(j))-48;
			//System.out.println("Num: " + num);
			retVal += num*(Math.pow(base, i));
			j--;
			i++;
		}
		return retVal;
	}
	public static String fromBase10(int number, int base)
	{
		int remainder = 0, divisor = number;
		String retVal = "";
		while(divisor!=0)
		{
			remainder = divisor % base;
			//System.out.println("Remainder: " + remainder);
			divisor = divisor / base;
			//System.out.println("Divisor: " + divisor);
			retVal += remainder;
		}
		
		return new StringBuilder(retVal).reverse().toString();
	}
}