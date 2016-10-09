import java.util.*;
/*
	The goal is to read in a list of integers into an array, read in an
	integer x, and print out the xth biggest number.
	For example given the list 4,8,2,3,5 and x=2, then 5 should be output
	as it is the second biggest number in the array.
*/
public class xthBiggest
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter how many elements are in your array:");
		int size = scan.nextInt();
		int []array = new int[size];
		PQ sorted = new PQ(size);
		System.out.println("Please now enter values into your array: ");
		for(int i = 0; i<5;i++)
		{
			array[i] = scan.nextInt();
			sorted.insert(array[i]);
		}
		System.out.println("Please enter an x value that represents xth biggest: ");
		int x = scan.nextInt();		
		for(int i = 0; i<x;i++)
		{
			if(i==x-1)
			{
				//System.out.println(sorted.remove() + " is the " + x + "th biggest number.");
				System.out.println(sorted.remove());
			}
			else
				sorted.remove();
		}
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