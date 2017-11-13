/*
 * Zion Whitehall
 * 11/13/13
 * Period 9
 * PaymentCalc
 */
import java.util.Scanner;
public class PaymentCalc 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		double annual,principle,payment;
		int months,choice=1;
		
		while(choice==1)
		{
			System.out.print("What is the amount of money you want to borrow?: ");
			principle=input.nextDouble();
			
			System.out.print("How long do you want to borrow this money for?: ");
			months=input.nextInt();
			months=months*12;
			
			System.out.print("What is your annual percentage rate?: ");
			annual=input.nextDouble();
			annual=1200/annual;
			
			payment=(annual+annual/(Math.pow((1+annual),months))-1)*principle;
			System.out.println("Your monthly payment is: "+payment);
			
			System.out.print("Go again? Press 1 for yes or any other number for no: ");
			choice=input.nextInt();
		}
		
		System.out.print("Thank you for using the PaymentCalc!");
	}

}
