import java.util.Scanner;
public class MethodCalculation 
{
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) //get numbers in main then send to method for calculation, and output as well
	{
		double number1=0,number2=0;
		System.out.print("enter number 1:");
		number1=input.nextDouble();
		System.out.print("enter number 2:");
		number2=input.nextDouble();
		calcAndOutputAverage(number1,number2);//method call sending the doubles to our method

	}
	
	//methods should be coded in isolation of context, meaning they should not be rely on the program for use
	//methods should be able to be coded knowing the following:
	//1. What they accept
	//2. What they do
	//3. What they return
	public static void calcAndOutputAverage(double num1, double num2)
	{
		double average=0;
		average=(num1+num2)/2;
		System.out.println("Your average is:"+average);
		displayAverage(average);
	}
	public static void displayAverage(double theAverage)
	{
		System.out.println("the average of your set of numbers is"+theAverage);
	}

}
