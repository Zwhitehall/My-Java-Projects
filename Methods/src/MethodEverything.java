/*
 * Zion Whitehall
 * 1/7/14
 * Period 9
 * MethodEverything
 */
import java.util.Scanner;
public class MethodEverything 
{// open of the class
	
	//in this space, we can declare "Global Variables" - accessible in any class
	static Scanner reader = new Scanner(System.in);
	static final double PI = 3.14;
	
	public static void main(String[] args)//main method header 
	{
		doEverything(); //Method call - when this line is read, the code jumps down to the method to activate 
					//method calls are made by typing the name of the method, followed by parentheses
					//method call end ends in semicolon
		

		
	}// end of main

	public static void doEverything()
	{
		
		double num1 = 0, num2 = 0, average = 0;
		System.out.print("Enter num1: ");
		num1 = reader.nextDouble();
		System.out.print("Enter num2: ");
		num2 = reader.nextDouble();
		
		average = (num1 + num2)/ 2;
		System.out.print("Your average is " + average);
		
	
	}

}// end of class


