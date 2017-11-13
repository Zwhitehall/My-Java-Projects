/*
 * Zion Whitehall
 * 11/27/13
 * Period 9
 * SumofPrimes
 */
import java.util.Scanner;
public class SumofPrimes 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number,total=0,prime;
		
		System.out.print("What is your number?: ");
		number=input.nextInt();
		
		for(int counter = 2; counter < number; counter ++)
		{
			prime=number%counter;
			
			if(prime!=0)
			{
				total=total+prime;
				System.out.println("The sum of your prime numbers are: "+total);
			}
			
			else
			{
			}
		}
	}

}
