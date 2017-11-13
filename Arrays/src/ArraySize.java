/*
 * Zion Whitehall
 * 12/5/13
 * Period 9
 * ArraySize
 */
import java.util.Scanner;
public class ArraySize 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int size,k;
		
		System.out.print("What is the size of your array: ");
		size=input.nextInt();
		int value[]=new int[size];
		int revalue[]=new int[size];
		k=size-1;
		
		for (int j=0; j < value.length; j++)
		{
			System.out.print("What is the value of array "+j+"?: ");
			value[j]=input.nextInt();
		}
		
		System.out.print("Your reversed values are: "+value[k]);
		for(int i = 0; i < value.length; i++)
		{
			revalue[k]=value[i];
			k--;
			System.out.print(", "+value[k]);
		}
		
		
		
	}

}
