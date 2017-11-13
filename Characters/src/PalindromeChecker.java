/*
 * Zion Whitehall
 * 1/30/14
 * Period 9
 * PalindromChecker
 */
import java.util.Scanner;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String word,wordBack=("");
		int length;
		char letter;
		
		System.out.print("Please enter your word: ");
		word=input.next();
		length=word.length();
		
		for(int i=word.length()-1; i >= 0; i--)
		{
			letter=word.charAt(i);
			wordBack=wordBack+letter;
		}
			
		if(word.equals(wordBack))
		{
			System.out.print("Your word is a palindrome!");
		}
		
		else
		{
			System.out.print("Your word is not a palindrome");
		}
	
	}

}
