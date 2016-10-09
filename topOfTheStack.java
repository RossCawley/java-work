import java.util.*;
/*
	Manipulate a stack according to the given push and pop commands
	and then output the number that is at the top of the stack. If a
	pop command is issued for an empty stack then nothing should happen.
*/
public class topOfTheStack
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of commands you wish to enter: ");
		int n = scan.nextInt();
		Stack alpha = new Stack(n);
		System.out.println("Using PUSH and POP, enter your preferred commands: ");
		for(int i = 0; i<=n;i++)
		{
			String s1[]=(scan.nextLine().split(" "));
			if(s1[0].equals("PUSH"))
			{
				alpha.push(Integer.parseInt(s1[1]));
			}
			else if(s1[0].equals("POP") && !alpha.isEmpty())
			{
				alpha.pop();
			}
		}
        if(alpha.isEmpty())
            {
            System.out.println("empty");
        }
        else
        {
            System.out.println(alpha.pop());   
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