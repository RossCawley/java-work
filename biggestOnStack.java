import java.util.*;
/*
	Manipulate a stack according to the given push and pop commands and
	then output the biggest number that is left on the stack. If a pop
	command is issued for an empty stack then nothing should happen. 
*/
public class biggestOnStack
{
	public static void main(String args[])
	{

		Scanner scan = new Scanner (System.in);
		//System.out.println("Please print the number of commands you wish to enter:");
		int n = scan.nextInt();
		Stack bravo = new Stack(n);
		
		int biggest = 0;
		while(scan.hasNextLine())
        {
            String s1[]=(scan.nextLine().split(" "));
			if(s1[0].equals("PUSH"))
			{
		      	bravo.push(Integer.parseInt(s1[1]));
			 	if(Integer.parseInt(s1[1])>biggest && !scan.nextLine().equals("POP")) 
			    {
					biggest = Integer.parseInt(s1[1]);
				}   
			}
			else if(s1[0].equals("POP") && !bravo.isEmpty())
			{
		      	bravo.pop();
			}    
        }
    
		if(bravo.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println(biggest);
		}
	}
}
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