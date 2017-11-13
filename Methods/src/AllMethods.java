import java.util.Scanner;
public class AllMethods 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double num1, num2, avg;
		num1=getDoubleFromInput(); //return methods need to be put somewhere
		num2=getDoubleFromInput();//you should always have a variable equaling the call of a return method
		avg=calculateAverage(num1, num2);//will be set in order
		displayAverage(avg);
	}//end of main

	//3 methods in this program divide up our tasks completely isolated from each other
	
	
	//1. get a double from user input //return double
	public static double getDoubleFromInput()
	{
		double myDouble=0;
		System.out.print("Enter a double: ");
		myDouble=input.nextDouble();
		return myDouble;
		
	}
	
	
	//2. calculate average of 2 doubles //return average
	public static double calculateAverage(double number1, double number2)
	{
		//double average = 0;
		//average = (number1+number2)/2;
		//return average; OR
		return (number1+number2)/2;
	}
	
	
	//3. output average
	public static void displayAverage(double average)
	{
		System.out.print("Your average is: "+average);
	}
}//end of class
