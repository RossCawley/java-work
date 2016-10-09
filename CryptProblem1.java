/*
Alice’s public key is (24852977, 2744, 8414508). You eavesdrop on the line and
observe Bob send her the cipher (15268076, 743675). Extract the message by any
means.
The programming challenge requires implementation of the same algorithm as
above, with the added problem of giving to crack the private key (try brute force).
Warning: for the programming part, make sure to use longs rather than ints (you
may need to put an ‘l’ at the end of the number). Also, make sure to keep
modulo-ing every time the number in the calculation gets a little too big – never
do large power multiplications straight off because Java cannot process large
numbers like this.
*/
public class CryptProblem1
{
	public static void main(String args[])
	{
		long p = 24852977l, g = 2744l, gxmodp = 8414508l, cx1= 15268076l, 
		c2 = 743675l, i = 0, x = 0;
		boolean found = false;
		while(!found)
		{
			if(modPow(g,i,p)==gxmodp)
			{
				found = true;
				x = i;
			}
			i++;
		}
		System.out.println(x);
		
	}
	public static long modPow(long number, long power, long modulus)
	{
		if(power==0)
			return 1;
		else if (power%2==0) 
		{
			long halfpower=modPow(number, power/2, modulus);
			return modMult(halfpower,halfpower,modulus);
		}
		else
		{
			long halfpower=modPow(number, power/2, modulus);
			long firstbit = modMult(halfpower,halfpower,modulus);
			return modMult(firstbit,number,modulus);
		}
	}
	public static long modMult(long first, long second, long modulus)
	{
		if(second==0)
			return 0;
		else if (second%2==0) 
		{
			long half=modMult(first, second/2, modulus);
			return (half+half)%modulus;
		}
		else
		{
			long half=modMult(first, second/2, modulus);
			return (half+half+first)%modulus;
		}
	}
}