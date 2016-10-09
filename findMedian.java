import java.util.*;
/*
	Read in a list of integers and output the median, i.e the one that when
	the numbers are put in order, is in the middle. If there are two middles,
	output the average of those numbers.
*/
public class findMedian
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements are in your array?");
		int size = scan.nextInt();
		int[]array = new int[size];
		PQ sorted = new PQ(size);
        boolean b = true;
		for(int i = 0; i<array.length;i++)
		{
			array[i] = scan.nextInt();
            if(array[i] == 0)
                b = false;
			sorted.insert(array[i]);
            
		}

       for(int i = 0; i<array.length;i++)
	   {
	       array[i] = sorted.remove();
	   }
       System.out.println(median(array));
    }
    public static double median(int[] m) 
    {
        int middle = m.length/2;
        if (m.length%2 == 1) 
           return m[middle];
        else 
           return (m[middle-1] + m[middle]) / 2.0;
    }
}
    
class PQ
{
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int numItems;
	
	public PQ(int s)
	{
		maxSize = s;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		numItems = 0;
	}
	public void printPQ()
	{
		System.out.println("Queue Contents:");
		for(int i = 0; i < numItems; i++)
		{
			System.out.println(queueArray[i]);
		}
	}
	public void insert(int item)
	{
		if(numItems == 0)
		{
			queueArray[0] = item;
		}
		else
		{
			int j = numItems;
			while(j > 0 && queueArray[j-1]>item)
			{
				queueArray[j] = queueArray[j-1];
				j--;
			}
			queueArray[j] = item;
		}
		front = numItems;
		numItems++;
	}
	public int remove()
	{
		int temp = queueArray[front];
		front--;
		if(front == maxSize)
		{
			front = 0;
		}
		numItems++;
		return temp;
	}
	public int peekFront()
	{
		return queueArray[front];
	}
	public boolean isEmpty()
	{
		return (numItems==0);
	}
	public boolean isFull()
	{
		return (numItems==maxSize);
	}
	public int queueSize()
	{
		return numItems;
	}	
	
}