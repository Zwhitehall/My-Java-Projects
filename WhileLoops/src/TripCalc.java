/*
 * Zion Whitehall
 * 10/24/13
 * Period 9
 * TripCalc
 */
 import java.util.Scanner;
 public class TripCalc
 {
 	public static void main(String[] args)
 	{
 		Scanner input=new Scanner(System.in);
 		double dist,size,miles,stops,gasprice,choice=1;
 		
 		while(choice==1)
 		{
 			System.out.print("How far is your destination?: ");
 			dist=input.nextDouble();
 			System.out.print("What is the size of your gas tank?: ");
 			size=input.nextDouble();
 			System.out.print("How many miles per gallon does your car go?: ");
 			miles=input.nextDouble();
 			System.out.print("What is the price per gallon?: ");
 			gasprice=input.nextDouble();
 			
 			stops=Math.ceil(dist/(size*miles));
 			System.out.println("You will need to stop "+stops+" times on the way to your destination.");
 			
 			System.out.print("Would you like to calculate for another trip? Press 1 to calculate or any other number to stop: ");
 			choice=input.nextDouble();
 		}
 			
 			System.out.print("Thank you for using the trip calculator!");
 
 	}
 }
 /*
  * How far is your destination?: 200
What is the size of your gas tank?: 15
How many miles per gallon does your car go?: 45
What is the price per gallon?: 3.20
You will need to stop 1.0 times on the way to your destination.
Would you like to calculate for another trip? Press 1 to calculate or any other number to stop: 2
Thank you for using the trip calculator!
  */