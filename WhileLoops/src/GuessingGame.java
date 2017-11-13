/*
 * Zion Whitehall
 * 11/11/13
 * Period 9
 * GuessGame
 */
import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Random gen=new Random();
		int guesser1,guesser2,answer,toss,counter=0;
		
		answer=gen.nextInt((100)+1);
		
		while(answer<=100)
		{
			toss=counter%2;
			
			if(toss==0)
			{
				System.out.print("Player 1 goes! ");
				System.out.print("Enter your number: ");
				guesser1=input.nextInt();
			
					if(answer<=guesser1)
					{
						System.out.println("Sorry, your answer was too high! ");
						
					}
					
					else if(answer>=guesser1)
					{
						System.out.println("Sorry, your answer was too low! ");
						
					}
					
					else if(guesser1==answer)
					{
						System.out.println("Player 1 is correct! Game Over!");
						
						break;
					}
			
				System.out.print("Player 2 goes!: ");
				guesser2=input.nextInt();
				
				if(answer>=guesser2)
				{
					System.out.println("Oooh! Your answer was too low! ");
					
				}
				
				else if(answer<=guesser2)
				{
					System.out.println("Oooh! Your answer was too high! ");
					
				}

				else if(guesser2==answer)
				{
					System.out.println("Player 2 is correct! Game Over!");
					
					break;
					
				}
			}
				
		}
			
		
	}
}

