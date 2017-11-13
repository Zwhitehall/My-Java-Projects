/*
 * Zion Whitehall
 * 10/23/13
 * Period 9
 * EquationOfLineWhileLoops
 */
import java.util.Scanner;
public class EquationOfLineWhileLoops 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		double slope,yint,choice=1,yvalue,xvalue;
		
		System.out.print("What is the slope of your line?: ");
		slope=input.nextDouble();
		System.out.print("What's the y intercept?: ");
		yint=input.nextDouble();
		
		
		System.out.println("Your line is: y= "+slope+"*x + "+yint);
		
		while(choice==1)
		{
			System.out.print("What's your x value?: ");
				xvalue=input.nextDouble();
				yvalue=slope*xvalue+yint;
				System.out.println("Your answer is: (" +xvalue+","+yvalue+")");
				
				System.out.print("Do you want to rerun your program? Press 1 to rerun or any other number to stop: ");
				choice=input.nextDouble();
		}
		
		System.out.print("Thank you for using the equation system!");
		
	}

}
/*
 *What is the slope of your line?: -2
What's the y intercept?: -9
Your line is: y= -2.0*x + -9.0
What's your x value?: 3
Your answer is: (3.0,-15.0)
Do you want to rerun your program? Press 1 to rerun or any other number to stop: 2
Thank you for using the equation system! 
 */
