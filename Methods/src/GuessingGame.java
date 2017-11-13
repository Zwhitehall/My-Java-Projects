/*
 * Zion Whitehall
 * 1/13/14
 * Period 9
 * GuessingGame
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame 
{
	static Scanner input = new Scanner(System.in);
	static Random gen = new Random();
	
	public static void main(String[] args) 
	{
		int flag=1,randNum,high,low,guess, rerun = 1,choice=1;
		
		while(choice==1)
		{
			System.out.print("Please enter a low range: ");
			low=input.nextInt();
			System.out.print("Please enter a high range: ");
			high=input.nextInt();
			randNum=getRandomNum(low, high);
			
			while(rerun==1)
			{
				guess=getGuess();
				flag=compareGuess(guess,randNum);
				//value of flag corresponds to either correct, too low, or too high
				rerun = reportToUser(flag);
				//value of rerun is going to decide whether or not to loop again
			}
			
			choice=playAgain();
		}
	}
	
	//task1
	public static int getRandomNum(int low, int high)
	{
		int randNum;
		randNum=gen.nextInt(high-low);
		return randNum;
	}
	
	//task2
	public static int getGuess()
	{
		int guess;
		System.out.print("Guess your number: ");
		guess=input.nextInt();
		return guess;
	}
	
	//task3
	public static int compareGuess(int guess,int randNum)
	{
		int flag;
		if(guess==randNum)
		{
			flag=2; //2 = correct
			return flag;
		}
		
		else if(guess<randNum)
		{
			flag=0; //0 = too low
			return flag;
		}
		
		else 
		{
			flag=1; //1 = too high
			return flag;
		}
		
	}
	
	//task4
	public static int reportToUser(int flag)
	{
		//in here, flag corresponds to one of the cases from above
		//if flag = 1, tell the user too high
		int rerun;
		
		if(flag==1)
		{
			System.out.println("Sorry, you're too high!");
			rerun=1;
			return rerun;
		}
		
		else if(flag==0)
		{
			System.out.println("Sorry, you're too low!");
			rerun=1;
			return rerun;
		}
		
		else
		{
			System.out.println("Your guess is correct!");
			rerun=0;
			return rerun;
		}
	}
	
	//task5
	public static int playAgain()
	{
		int choice=0;
		System.out.print("Play again? Press 1 for to run or any other number for no: ");
		choice=input.nextInt();
		return choice;
	}
}