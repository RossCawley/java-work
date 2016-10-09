import java.util.*;
/*
The goal is to read in 3 numbers and output the one which is most different from the other two
i.e the one with the greatest difference from the nearest number to it. If there is no single 
outlier, print "NA"
*/

public class findOutlier
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int array[] = new int [3];
		for(int i = 0; i<array.length;i++)
		{
			array[i] = scan.nextInt();
		}
		int temp = 0;
		for(int i = 0; i <array.length; i++)
		{
			for(int j = 0; j<array.length;j++)
			{
				if(j!=array.length-1 && array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		/*for(int i = 0; i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}*/
		if(array[1]-array[0] > array[2]-array[1])
		{
			System.out.println(array[0]);
		}
		else if (array[1]-array[0] < array[2]-array[1])
		{
			System.out.println(array[2]);
		}
		else
		{
			System.out.println("NA");
		}
	}
}