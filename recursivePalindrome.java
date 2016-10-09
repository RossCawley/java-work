import java.util.Scanner;
/*
	Write a cursive method that prints TRUE if a string is palindromic
	and FALSE if it is not.
*/
public class recursivePalindrome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		String s1 = scan.nextLine();
		System.out.println(palindromeCheck(s1));
	}
	public static String palindromeCheck(String s1)
	{
		int i = 0, j = s1.length();
		if(s1.length()<=1)
		{
			return "TRUE";
		}
		else if(s1.charAt(i)==s1.charAt(j-1))
		{
			i++;
			j--;
			return palindromeCheck(s1.substring(i, j));
		}
		else
		{
			return "FALSE";
		}
	}
}