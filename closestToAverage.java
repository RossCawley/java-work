import java.util.*;
/*
	The goal is to read in a list of integers into an array and output the
	one which is closest to the average. For example, the average of 4,8,2,3
	and 5 is 4.25 and 4 is closest to this. If there are two values equally 
	close, choose the one which appears earliest in the list. 
*/
public class closestToAverage
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an array size:");
		int array[] = new int[scan.nextInt()];
		System.out.println("Now enter values into your array:");
		int average = 0;
		for(int i = 0; i<array.length;i++)
		{
			array[i] = scan.nextInt();
			average += array[i];
		}
		average = average/array.length;
		System.out.println("Average = " + average);
		int closest = 1000, x = 0;
		for(int i = 0; i<array.length;i++)
		{
			if(array[i] == average)
			{
				System.out.println("MARK5");
				x = array[i];
				break;
			}
			else if(array[i] > average)
			{
				System.out.println("MARK1");
				System.out.println((array[i]-average) + " < " + closest);
				if(array[i]-average <= closest)
				{
					System.out.println("MARK2");
					closest = array[i]-average;
					x = array[i];
				}
				System.out.println("SKIP");	
			}
			else
			{
				System.out.println("MARK3");
				System.out.println((average-array[i]) + " < " + closest);
				if(average - array[i] <= closest)
				{
					System.out.println("MARK4");
					closest = average-array[i];
					x = array[i];
				}
				System.out.println("SKIP");
			}
		}
		System.out.println(x);
		
	}
}