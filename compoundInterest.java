import java.util.Scanner;
/*
	Write a recursive method that takes in a bank account balance x,
	an interest rate i and a number of years y, and outputs how much 
	the bank account will be worth after y years. For example, if you
	invest €100 at 2% annual interest, then after year 1 you will have
	€102.00, after year 2 you have €104.04, after year 3 you have €106.12
	and so forth.
*/
public class compoundInterest
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		double balance = scan.nextDouble();
		double rate = scan.nextDouble();
		int years = scan.nextInt();
		System.out.println(String.format("%.2f",compound(balance,rate,years)));
	}
	public static double compound(double x,double i,int y)
	{
		if(y == 0)
		{
			return x;
		}
		double factor = 1+(i/100);
		double one = x;
		double two = i;
		int three = y-1;
		return factor*compound(one,two,three);
	}
}