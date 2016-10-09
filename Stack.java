class Stack{
	private int maxSize; //size of stack array
	private int[] stackArray; 
	private int top; //top of stack
	
	public Stack(int s) //constructor class
	{
		maxSize = s; //set array size
		stackArray = new int[maxSize]; //create array of size s
		top = -1; //no items yet, top = -1
	}
	
	public void push(int j) //put item on top of stack
	{
		top++; //increment top of stack
		stackArray[top]=j;	//top of stack = j, the input number
	}
	
	public int pop()
	{
		return stackArray[top--]; //return the top of stack, decrease stack size
	}
	
	public int peek()
	{
		return stackArray[top]; //return top of stack without decrementing
	}
	
	public boolean isEmpty()//true if stack is empty
	{
		return (top==-1);
	}
	
	public boolean isFull()//true if stack is full
	{
		return (top == maxSize-1);
	}
	
	public void makeEmpty()//returns empty stack
	{
		top=-1;
	}
}