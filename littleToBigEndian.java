import java.util.*;
/*
	Convert an integer from little to big endian.
*/
public class littleToBigEndian
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String n2 = toBase2(num);
		String LtB = littleToBig(n2);
		System.out.println(toBase10(LtB));
	}
	public static String toBase2(int n)
	{
		int remainder = 0, divisor = n;
		String retVal = "";
		while(divisor!=0)
		{
			remainder = divisor % 2;
			//System.out.println("Remainder: " + remainder);
			divisor = divisor / 2;
			//System.out.println("Divisor: " + divisor);
			retVal += remainder;
		}
		while(retVal.length()<32)
		{
			retVal+="0";
		}
		return new StringBuilder(retVal).reverse().toString();
	}
	public static int toBase10(String number)
	{
		int retVal = 0, i = 0, j = number.length()-1, base = 2;
		while (j>=0)
		{
			int num = (int)(number.charAt(j))-48;
			//System.out.println("Num: " + num);
			retVal += num*(Math.pow(base, i));
			j--;
			i++;
		}
		return retVal;
	}
	public static String littleToBig(String num)
	{
		String[] array = new String[4];
		int div = 0, counter = 0;
		//System.out.println("Num: " + num);
		for(int i = 0; i<=num.length();i++)
		{
			if(i % 8 == 0 && i!=0)
			{
				//System.out.println("Div: " + div + ", i: "+ i);
				array[counter] = num.substring(div, i);
				div = i;	
				//System.out.println("Array at " + counter + ": "+ array[counter]);
				counter++;
				//System.out.println("Div: " + div);
				
			}
		}
		int i = 0, j = array.length-1;
		/*for(int k = 0; k<array.length;k++)
		{
			System.out.print(array[k]+ " ");
			//retVal+= array[k];
		}*/
		while(i<j)
		{
			//System.out.println("Array[i]: " + array[i]);
			String temp = array[j];
			//System.out.println("j = " + j + ", Temp after one: " + temp + ", array at " + j + " = " + array[j]);
			array[j] = array[i];
			array[i] = temp;
			//System.out.println("Array[i]: " + array[i]);
			//System.out.println("Array[j]: " + array[j]);
			i++;
			j--;
		}
		String retVal = "";
		for(int k = 0; k<array.length;k++)
		{
			//System.out.println("Array at " + k + ": "+ array[k]);
			retVal+= array[k];
		}
		return retVal;
	}
}