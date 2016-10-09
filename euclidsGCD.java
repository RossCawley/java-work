import java.util.*;
/*
	Euclid's algorithm is the oldest algorithm ever written dow. It is named
	after the ancient Greek mathematician Euclid, who first described it
	in his Elements around 300BC. It involves a recursive algorithm for 
	deriving the Greatest Common Divisor GCD of a pair of numbers. Let the
	first number be x and the second number be y. If either x or y is a zero, 
	then the GCD is the other number. Otherwise the GCD is equal to that of
	(y, x%y).
	Complete the method that implements Euclid's algorithm.
*/
public class euclidsGCD
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong(), y = scan.nextLong();
		System.out.println(GCD(x,y));
	}
	
	public static long GCD(long x, long y)
	{
		if(y == 0)
			return x;
		else if(x == 0)
			return y;
		long one = y;
        long two = x%y;
		return GCD(one,two);
			
	}
}