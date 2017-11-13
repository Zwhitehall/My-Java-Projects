/*
 * Zion Whitehall
 * 11/1/13
 * Period 9
 * FactorFinder
 */
import java.util.Scanner;
public class FactorFinder 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number,factors=1,counter=1;
		
		System.out.print("What number would you like to find the factors for?: ");
		number=input.nextInt();
		System.out.print("Your factors are: 1");
		
		while(factors<=factors%2)
		{
			factors=number%counter;
			System.out.print(","+factors);
					
			counter++;
		}
		
		
	}

}
