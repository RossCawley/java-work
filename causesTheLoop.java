import java.util.*;
/*
	A loop in a linked list occurs when following the linked list chain
	brings you back to where you started. For example, link 1 -> link 2
	-> link 3 -> link 1 -> link 2 ... etc. and you go around in an infinite
	loop. Each test case here involves a single-ended singly-linked list
	with a potential loop. Output the data of the link whose pointer has 
	caused the link list to loop back to a previous point. 
*/
public class causesTheLoop
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		Link array[] = new Link[num];
		for(int i = 0; i<num;i++)
		{
			array[i] = new Link(scan.nextLine());
		}
		
		while(scan.hasNext())
		//for(int i = 0; i<array.length;i++)
		{
			int select = scan.nextInt();
			int next = scan.nextInt();
			if(next!=-1)
			{
				array[select].next=array[next];
			}
		}
		LinkedList mylist = new LinkedList();
		if(num > 0)
		{
			mylist.first = array[0];
		}
		System.out.println(findLoop(mylist));
	}
	
	public static String findLoop(LinkedList mylist)
	{
		if(mylist.isEmpty()){
        return("empty");
        }
        Link[] checklist = new Link[100];
        int counter=0;
        Link forwards = mylist.first;
        while(forwards.next!=null){
            checklist[counter]=forwards;
            Link temp=forwards;
            forwards=forwards.next;
            for(int i=0;i<counter;i++){
                if(forwards==checklist[i]){
                    return(temp.data);
                }
            }
            counter++;
        }
        return("OK");
    }
}

class Link
{
	public String data;
	public Link next;
	
	public Link(String input)
	{
		data = input;
		next = null;
	}
}
class LinkedList
{
	public Link first;
	
	public LinkedList()
	{
		first = null;
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void insertHead(Link insert)
	{
		if(isEmpty())
		{
			first = insert;
		}
		else
		{
			insert.next = first;
			first=insert;
		}
	}
}