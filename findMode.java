import java.util.*;
/*
	The goal is to read in a list of integers into an array and output
	the one which occurs most frequently. If there are two or more values
	that occur most frequently then choose the one which occurs earliest 
	in the list.
*/
public class findMode
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an array size:");
		int array[] = new int[scan.nextInt()];
		System.out.println("Now enter values into the array:");
		for(int i = 0; i<array.length;i++)
		{
			array[i] = scan.nextInt();
		}
		int counter = 0, tempCount = 0, temp = 0, frequent = 0;
		for(int i = 0; i<array.length;i++)
		{
			temp = array[i];
			for(int j = 0; j<array.length;j++)
			{
				if(temp==array[j])
				{
					tempCount++;
				}
			}
			if(tempCount>counter)
			{
				counter = tempCount;
				frequent = temp;
			}
			tempCount = 0;
		}
		System.out.println(frequent);
		
	}
}