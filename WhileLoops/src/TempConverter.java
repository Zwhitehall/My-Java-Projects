/*
 * Zion Whitehall
 * 10/24/13
 * Period 9
 * TempConverter
 */
 import java.util.Scanner;
 public class TempConverter
 {
 	public static void main(String[] args)
 	{
 		Scanner input=new Scanner(System.in);
 		double celsius,fahrenheit,choice=1,answer;
 		
 		while(choice==1)
 			{
 				System.out.print("Press 1 to convert Celsius to Fahrenheit or any other number to convert Fahrenheit to Celsius: ");
 				answer=input.nextDouble();
 				
 				if(answer==1)
 				{
 					System.out.print("Please enter Celsius: ");
 					celsius=input.nextDouble();
 					fahrenheit=(celsius*9/5)+32;
 					System.out.println("Your temperature is: " +fahrenheit);
 				
 					System.out.print("Go again? Press 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius, or any other number to stop: ");
 					answer=input.nextDouble();
 				}
 		
 				if(answer==2)
 				{
 					System.out.print("Please enter Fahrenheit: ");
	 				fahrenheit=input.nextDouble();
	 				celsius=(fahrenheit-32)*5/9;
	 				System.out.println("Your temperature is: " +celsius);
	 				
	 				System.out.print("Go again? Press 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius, or any other number to stop: ");
	 				answer=input.nextDouble();
 				}
	 				
 			}
 		
 			System.out.print("Thanks for using the TempConverter!");
 	}
 }
 /*
  *Press 1 to convert Celsius to Fahrenheit or any other number to convert Fahrenheit to Celsius: 1
Please enter Celsius: 100
Your temperature is: 212.0
Go again? Press 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius, or any other number to stop: 2
Please enter Fahrenheit: 212
Your temperature is: 100.0
  */
