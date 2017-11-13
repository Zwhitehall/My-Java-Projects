/*
 * Zion Whitehall
 * 12/16/13
 * Period 9
 * PalindromeChecker
 */
//Figure out how many digits a number is
//Create array of that size
//Extract digits and save to array (Repeat step one and save into the array)
//Modding by 10 gives your first digit up until you get to 10
//Modding by 10 will give you the first every time
//number=number/10
//loop while(number>=0)
import java.util.Scanner;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int digits,number;
		
		System.out.print("Please enter your number: ");
		number=input.nextInt();
		
		System.out.println("How many digits is in your number?: ");
		digits=input.nextInt();
		
		while(number>=0)
		{
			number=number/10;
			
			System.out.println(number);
			
			number++;
		}
	}

}
