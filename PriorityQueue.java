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