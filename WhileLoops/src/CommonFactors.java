/*
 * Zion Whitehall
 * 11/11/13
 * Period 9
 * CommonFactors
 */
import java.util.Scanner;
public class CommonFactors 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1,num2,fact1=0,fact2=0,counter=1;
		
		System.out.print("Please enter your first number: ");
		num1=input.nextInt();
		System.out.print("Please enter your second number: ");
		num2=input.nextInt();
		System.out.print("Your common factors of "+num1+" and "+num2+" are: ");
		
		while(counter<=num1/2 && counter<=num2/2)
		{
			fact1=num1%counter;
			fact2=num2%counter;
		
			if(fact1==0)
			{
				System.out.print(counter+",");
				
				if(fact2!=fact1)
				{
					
				}
			}
			
			else
			{
				
			}
			
			counter++;
		}
		
		
	}

}
