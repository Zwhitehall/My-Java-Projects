/*
 * Zion Whitehall
 * 1/9/14
 * Period 9
 * Triangles
 */
import java.util.Scanner;
public class Triangles
{
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int choice=1;
		while(choice==1)
		{
			double leg1,leg2,hypo;
			leg1=getLegDouble();
			leg2=getLegDouble();
			hypo=calculateHypo(leg1, leg2);
			outputRightTriangle(leg1,leg2,hypo);
			choice=playAgain();
		}
		
	}

	//task 1
	public static double getLegDouble()
	{
		double getLegDouble=0;
		System.out.print("Enter a double: ");
		getLegDouble=input.nextDouble();
		return getLegDouble;
	}
	
	//task 2
	public static double calculateHypo(double leg1, double leg2)
	{
		//getLegDouble twice look at Main in AllMethods
		double hypo=0;
		hypo=Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
		return hypo;
	}
	
	//task 3
	public static void outputRightTriangle(double leg1, double leg2, double hypo)
	{
		System.out.println("Your hypotenuse is: "+hypo);
	}
	
	public static int playAgain()
	{
		int choice=0;
		System.out.print("Thank you for choosing the Hypotenuse finder! Press 1 for to run or any other number for no: ");
		choice=input.nextInt();
		return choice;
	}
}
