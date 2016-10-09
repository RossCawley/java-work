import java.util.*;
public class mergeSortEx1
{
	public static void main(String args[])
	{
		int array[] = new int[10];
		Random rand = new Random();
		System.out.println("Unsorted Array:");
		for(int i = 0; i<array.length;i++)
		{
			array[i] = rand.nextInt(10);
			System.out.print(array[i] + " ");
		}
		System.out.println("\n**************");
		System.out.println("Sorted Array:");
		mergeSort(array);
		for(int i = 0; i < array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	public static void mergeSort(int[] a)
	{
		int length = a.length;
		if(length<2)
		{
			return;
		}
		int mid = length/2, k = 0;
		int[]left = new int[mid];
		int[]right = new int[length-mid];
		for(int i = 0; i<left.length;i++)
		{
			left[i] = a[k];
			k++;
		}
		for(int i = 0; i<right.length;i++)
		{
			right[i] = a[k];
			k++;
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	public static void merge(int[] left, int[] right, int[]a)
	{
		int i = 0, j = 0, k = 0,nLeft = left.length, nRight=right.length;
		while(i<nLeft&&j<nRight)
		{
			if(left[i]<right[j])
			{
				a[k]=left[i];
				k++;
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}	
		}
		if(i<nLeft)
		{
			while(i<nLeft)
			{
				
				a[k] = left[i];
				k++;
				i++;
			}
		}
		else if(j<nRight)
		{
			while(j<nRight)
			{
				a[k] = right[j];
				k++;
				j++;
			}
		}
	}
}