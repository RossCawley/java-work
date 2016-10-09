import java.util.*;
/*
	Write a recursive method that finds the probabilty that in a class of
	n people, some pair of them will have the same birthday.
*/
public class birthdayProblem
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(String.format("%.3f",(1-birthday(n))));
	}
	
	public static double birthday(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return birthday(n-1)*(365.0-(n-1))/365.0;
		}
	}
}