import java.util.*;
public class QuickSort {
     
    private int array[];
    private int length;
	
    public static void main(String a[])
	{
        Scanner scan = new Scanner(System.in);
        QuickSort sorter = new QuickSort();
		System.out.println("Please enter the size of your chosen array:");
        int[] input = new int[scan.nextInt()];
		System.out.println("Now enter contents into the array:");
		for(int i = 0; i<input.length;i++)
		{
			input[i] = scan.nextInt();
		}
		System.out.println("Your unsorted array:");
		for(int i = 0; i<input.length;i++)
		{
			System.out.print(input[i] + " ");
		}
        sorter.sort(input);
		System.out.println("Your sorted array:");
        for(int i = 0; i<input.length;i++)
		{
            System.out.print(input[i] + " ");
        }
    }
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;	//returns if the array is empty
        }
        this.array = inputArr;	//giving the global array the values of the input array
        length = inputArr.length;	//giving the global length the length of the input array
        quickSort(0, length - 1);	//to start, the first and last elemens of the array are called to the quickSort method.
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;		//i will start from the left 
        int j = higherIndex;	//j will start from the right
        
		// calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
		// Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;	//if i is less than the pivot, it is on the correct side of the array
            }
            while (array[j] > pivot) {
                j--;	//if j is greater than the pivot, it is on the correct side of the array
            }
            if (i <= j) 
			{
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     

}