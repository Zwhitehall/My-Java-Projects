/*
 * Zion Whitehall
 * 10/30/13
 * Period 9
 * Multiplier
 */
import java.util.Scanner;
public class Multiplier 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int number,nummulti,counter=1,multiples=0;
		
		System.out.print("What number would you like to see multiples of?: ");
		number=input.nextInt();
		
		System.out.print("How many mutliples would you like to see?: ");
		nummulti=input.nextInt();
		
		System.out.print("Your "+nummulti+" multiples of "+number+" are: ");
		
		while(counter<=nummulti)
		{
			multiples=number*counter;
			
			System.out.print(multiples + ",");
			
			counter++;
		}
			
	}

}
