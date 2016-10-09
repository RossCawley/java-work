import java.util.*;
/*
	Find the largest integer that can be created from a pair of integers
	and the following bit manipulation operators: <<,>> and |. Once the
	| operator is applied, the two inputs are consumed and cannot be
	referred to again. So you can shift the two original integers as much
	as you want, then apply the | operator to yield the result.
*/
public class bitManipulation {
    public static void main(String args[]) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        int num1 = myscanner.nextInt();
        int num2 = myscanner.nextInt();
        int record=Integer.MIN_VALUE;
        for(int i = 0;i<=32;i++){
            for(int j=0;j<=32;j++){
                if(((num1<<i)|(num2<<j))>record)
				{
                    record=((num1<<i)|(num2<<j));
                }
                if(((num1>>i)|(num2<<j))>record)
				{
                    record=((num1>>i)|(num2<<j));
                }
                if(((num1<<i)|(num2>>j))>record)
				{
                    record=((num1<<i)|(num2>>j));
                }
                if(((num1>>i)|(num2>>j))>record)
				{
                    record=((num1>>i)|(num2>>j));
                }
            }
        }
        System.out.println(record);
    }
}