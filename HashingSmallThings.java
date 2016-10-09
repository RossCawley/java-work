import java.util.*;
public class HashingSmallThings
{
	static int HashArray[] = new int[19];
	static int array[] = new int[10];
	
	public static void main(String args[])
	{
		Random r = new Random();
		for(int i = 0; i<array.length; i++)
		{
			array[i] = r.nextInt(1000);
		}
	}
}