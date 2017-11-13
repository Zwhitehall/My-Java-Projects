/*
 * Zion Whitehall
 * 11/12/13
 * Period 9
 * PrimeChecker
 */
import java.util.Scanner;
public class PrimeChecker 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number,choice=1,counter=2,flag=3;
		
		while(choice==1)
		{
			System.out.print("Please enter your number: ");
			number=input.nextInt();
			
			if(number%counter!=0)
			{
				System.out.println("Your number is a prime number.");
				
				counter++;
				
				
			}
			
			else if(number%counter==0)
			{
				System.out.println("Your number is not a prime number.");
				
				counter++;
				
			}
				
			
			
			System.out.print("Would you like to enter another number? Press 1 for yes or any other number for no: ");
			choice=input.nextInt();
		}
		
		System.out.print("Thank you for using the Prime Number Checker!");
	}
}
