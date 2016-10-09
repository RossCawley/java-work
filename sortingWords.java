import java.util.*;
/*
	The goal is to sort a long list of words by special order. The 
	special order is as follows: all the words are sorted by length,
	starting with the shortest, and ending with the longest. For words
	of the same length, these should be sorted alphabetically[a-z].
*/
public class sortingWords
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String array[] = new String[Integer.parseInt(scan.nextLine())];
		for(int i = 0; i<array.length; i++)
		{
			array[i] = scan.nextLine();
		}
		mergeSort(array);
		for(int i = 0; i<array.length;i++)
		{
			System.out.print(array[i]+"\n");
		}
		
	}
	public static void mergeSort(String[] a)
	{
		int length = a.length;
		if(length<2)
		{
			return;
		}
		int mid = length/2, k = 0;
		String[] left = new String[mid];
		String[] right = new String[length-mid];
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
	public static void merge(String[] left, String[] right, String[] a)
	{
		int i = 0, j = 0, k = 0,nLeft = left.length, nRight=right.length;
		while(i<nLeft&&j<nRight)
		{
			if(left[i].length()==right[j].length())
			{
				if(!check(left[i],right[j]))
				{
					a[k]=left[i];
					k++;
					i++;
				}
				else
				{
					a[k]=right[j];
					k++;
					j++;
				}
			}
			else if(left[i].length()<right[j].length())
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
     public static boolean check(String one, String two)
	 {
        if(one.compareTo(two)>0)
		{
            return true;
        }
		else
		{
            return false;
        }
     }
}