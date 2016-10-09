import java.util.*;
/*
	Manipulate a queue according to the given insert and remove comands
	and then output the string that is at the front of the queue. If a 
	remove commands is issued for an empty queue, then nothing should
	happen.
*/

public class frontOfTheQueue
{
	public static void main(String args[])
	{
		PQ delta = new PQ(100);
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNextLine())
		for(int i = 0; i<5;i++)
		{
			String s1[] = scan.nextLine().split(" ");
			if(s1[0].equals("INSERT"))
			{
				delta.insert(s1[1]);
			}
			else if(s1[0].equals("REMOVE") && !delta.isEmpty())
			{
				delta.remove();
			}
		}
		if(delta.isEmpty())
			System.out.println("empty");
		else
			System.out.println(delta.remove());
			
	}
}
class PQ
{
	private int maxSize;
	private String[] queueArray;
	private int front;
	private int rear;
	private int numItems;
	
	public PQ(int s)
	{
		maxSize = s;
		queueArray = new String[maxSize];
		front = 0;
		rear = -1;
		numItems = 0;
	}
	public boolean insert(String item)
	{
		if(!isFull())
		{
			rear++;
			queueArray[rear]=item;
			numItems++;
			return true;
		}
		else
		{
			return false;
		}
	}
	public String remove()
	{
		String temp = queueArray[front];
		front++;
		if(front == maxSize)
		{
			front = 0;
		}
		numItems--;
		return temp;
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