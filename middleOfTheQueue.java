import java.util.*;
/*
	Manipulate a queue according to the given insert and remove commands
	and then output the string that is in the middle of the queue. If there
	is an even number of strings in the queue, thus two middle strings,
	output the one which is nearest the front. If a remove command is issued
	for an empty queue, nothing should happen.
*/
public class middleOfTheQueue
{
	public static void main(String args[])
	{
		PQ delta = new PQ(100);
		Scanner scan = new Scanner(System.in);
		boolean found = false;
		//while(scan.hasNextLine())
		for(int i = 0; i<6;i++)
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
		
		if(!delta.isEmpty())
        {
            int middle = delta.queueSize();
            if(middle%2==1)
            {
                middle++;
            }
            middle=middle/2;
            for(int i =0; i<middle-1;i++){
                delta.remove();
            }
            System.out.println(delta.remove());
        }
        else
        {
            System.out.println("empty");
        }
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
	public void printPQ()
	{
		System.out.println("Queue Contents:");
		for(int i = 0; i < numItems; i++)
		{
			System.out.println(queueArray[i]);
		}
	}
}