/*
 * Zion Whitehall
 * 2/4/14
 * Period 9
 * CodeHangman
 */
import java.util.Scanner;
public class CodeHangman 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String letter,word;
		int flag=6;
		
		System.out.print("Let's play some hangman! Alright, someone enter a word or sentence! No peeking now!: ");
		word=input.nextLine();
		
		System.out.print("Good, now that we have our word, we can start the game! Now the player enters a letter: ");
		letter=input.next();
		
		for(int i = 0; i <= flag; i++)
		{
			if(letter!=word.charAt())
			{
				System.out.print("Sorry try again!: ");
				letter=input.next();
			}
			
			else
			{
				System.out.print("Correct! Keep going!: ");
				letter=input.next();
				flag++;
			}
			
			System.out.print("Sorry you're out of chances!");
		}
	}

}
