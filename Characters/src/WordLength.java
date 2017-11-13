/*
 * Zion Whitehall
 * 1/29/14
 * Period 9
 * WordLength
 */
import java.util.Scanner;
public class WordLength 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String inpword,choice=("yes");
		int length;
		
		while(choice.equals("yes"))
		{
			System.out.print("Please enter a word: ");
			inpword=input.next();
			length=inpword.length();
			System.out.println("Your word is "+length+" characters long");
			
			System.out.print("Would you like to go again?: ");
			choice=input.next();
		}
	}

}
