import java.util.*;
/*
	5/3/1 algorithm for working out weight goals, numbers for any given one rep max.
*/

public class myWorkout
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Squat(KG): ");
		double squat = scan.nextDouble()*0.9;	
		System.out.println("Overhead Press(KG): ");
		double press = scan.nextDouble()*0.9;		
		System.out.println("Bench Press(KG): ");
		double bench = scan.nextDouble()*0.9;
		System.out.println("Deadlift(KG): ");
		double deadlift = scan.nextDouble()*0.9;
		System.out.println("90% of Squat: " + squat + "kg");
		System.out.println("90% of Overhead Press: " + press + "kg");
		System.out.println("90% of Bench Press: " + bench + "kg");		
		System.out.println("90% of Deadlift: " + deadlift + "kg");
		
		for(int week = 1; week<=4; week++)
		{
			if (week == 1)
			{
				System.out.println("*****WEEK 1*****");
				for(int set = 1; set<=3; set++)
				{
					System.out.println("*****SET 1*****");
					if(set == 1)
					{
						System.out.println("Squat(KG): 5x" + squat*0.65);
					}
					else if(set == 2)
					{
						System.out.println("Squat(KG): 5x" + squat*0.75);
					}
					else
					{
						System.out.println("Squat(KG): 5x" + squat*0.85);
					}
				}
			}
		}
	}
}