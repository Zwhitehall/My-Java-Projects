/*
 * Zion Whitehall
 * 1/2/14
 * Period 9
 * Averages
 */
import java.util.Scanner;
public class Averages 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int size,nums[]=new int[5];
		double leg1,leg2,hypo,total=0,average=0,number,numevens=0;
		
		//task 1
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print("Please enter a number into array "+i+": ");
			nums[i]=input.nextInt();
			total=total + nums[i];
			average=total/5;
		}
		
		displayAverage(average);//Method Call - calling our method to perform the task it was meant to do.
		//make a method call: type the method, followed by the parentheses with any variable that you need to send the method
		
		//task 2
		System.out.print("Please enter the number for the first leg: ");
		leg1=input.nextDouble();
		System.out.print("Please enter the number for the second leg: ");
		leg2=input.nextDouble();
		hypo=(leg1*leg1)+(leg2*leg2);
		hypo=Math.sqrt(hypo);
		total=leg1+leg2+hypo;
		average=total/3;
		System.out.println("Your hypotenuse is: "+hypo);
		displayAverage(average);
		
		//task 3
		System.out.print("How many grades would you like to enter?: ");
		size=input.nextInt();
		int grade[]=new int[size];
		
		for(int j=0; j < grade.length; j++)
		{
			System.out.print("Please enter grade for student "+j+": ");
			grade[j]=input.nextInt();
			total=total+grade[j];
			average=total/size;
		}
		
		displayAverage(average);
		
		//task 4
		for(int k = 0; k < 10; k++)
		{
			System.out.print("Please enter a number: ");
			number=input.nextDouble();
			
			if(number%2==0)
			{
				total=total+number;
				numevens++;
			}
			
			average=total/numevens;
		}
		
		displayAverage(average);
	
	}//closing bracket of main method
	
	//all methods go in this space. After main closes, but before class closes
	//variables in methods should be different from where they came from
	//variables declared in methods are only accessible in the method it was declared in (local variable)
	//the averages 1-4 was local in the main method - declared in main, only accessible in main
	public static void displayAverage(double theAverage)//no semicolon after method header
	{
		System.out.println("We are in the Method now!");
		System.out.println("The average of your set of numbers is "+theAverage);
		//If we change the value of theAverage here and try to display it in the above method, it will not display it
	}

} //closing bracket of class
