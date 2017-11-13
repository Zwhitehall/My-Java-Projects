/*
 * Zion Whitehall
 * 11/19/13
 * Period 9
 * GuessingGame
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Random gen=new Random();
		int randnum,mynum;

		for(int num=1; num < 10; num++)
		{
			randnum=gen.nextInt((50-1)+1);
			
			System.out.print("I'm thinking of a number between 1 and 50. What is it?: ");
			mynum=input.nextInt();
			
			if(mynum!=randnum)
			{
				System.out.println("Nope! Try again: ");
			}
			
			else if(mynum==randnum)
			{
				System.out.print("Correct!");
				
				break;
			}
		}
		
		System.out.print("Sorry, you're out of guesses!");
		
	}

}
