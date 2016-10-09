import java.util.*;
/*
	The goal is to sort a long list of words by special order. The special
	order is as follows. All the words are sorted by the greatest character
	in that word. What this means is that all words whose greatest character
	is 'a' should come first, followed by all words whose greatest character
	is a 'b' (e.g 'baa') and so one. Greatest means further along in the
	alphabet. The very last words in the list will be those whose greatest
	character is 'z'.
	For words who have the same greatest character (e.g 'salt','table'), should
	be sorted alphabetically. Hint, casting a character into an int makes it 
	easier to find the greatest character.
*/
public class sortingMoreWords
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
				if(check(left[i],right[j]))
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
		String biggest = "";
		for(int i = 0; i<one.length();i++)
		{
			if(one.charAt(i)>two.charAt(i))
			{
				biggest = one;
			}
			else if(two.charAt(i)>one.charAt(i))
			{
				biggest = two;
			}
		}
		if(biggest == one)
		{
			return true;
		}
		else
		{
			return false;
		}
     }
}