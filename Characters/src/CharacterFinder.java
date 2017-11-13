/*
 * Zion Whitehall
 * 1/30/14
 * Period 9
 * CharacterFinder
 */
import java.util.Scanner;
public class CharacterFinder 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String word,choice=("yes"),choice2;
		char indspot;
		int index;
		
		System.out.print("Please enter a word: ");
		word=input.next();
		
		while(choice.equals("yes"))
		{	
			System.out.print("What index spot would you like to see?: ");
			index=input.nextInt();
			indspot=word.charAt(index-1);
			System.out.println("The character at index spot "+index+" is: "+indspot);
			
			System.out.print("Would you like to enter another index spot?: ");
			choice=input.next();
		}
		
		System.out.print("Would you like to enter a different word?: ");
		choice2=input.next();
		
		while(choice2.equals("yes"))
		{
			System.out.print("Please enter a word: ");
			word=input.next();
			System.out.print("What index spot would you like to see?: ");
			index=input.nextInt();
			indspot=word.charAt(index-1);
			System.out.println("The character at index spot "+index+" is: "+indspot);
			
			System.out.print("Would you like to enter another index spot?: ");
			choice2=input.next();
		}
		
		System.out.print("Thanks for using the CharacterFinder!");
	}

}
