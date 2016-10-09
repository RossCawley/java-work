import java.util.*;
/*
	Check if a word is a palindrome by using Stacks.
*/
public class stackedPalindrome 
{
    public static void main(String args[]) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Stack palindrome = new Stack(input.length());
        input = input.toLowerCase();
        input = input.replace(" ", "");
        for(int i = 0; i<input.length();i++)
        {
            palindrome.push(input.charAt(i));    
        }
        boolean b = true;
        for(int i = 0; i<input.length();i++)
        {
            if(palindrome.pop()==input.charAt(i))
            {
                b = true;
            }
            else
            {
                b = false;
                break;
            }
        }
        if(b)
		{
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}