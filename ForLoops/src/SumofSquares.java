/*
 * Zion Whitehall
 * 11/21/13
 * Period 9
 * SumofSquares
 */
import java.util.Scanner;
public class SumofSquares 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		double natnum1,sqrsum=0,natnum2,sum=0,diff,nums;
		
		System.out.print("How many numbers would you like to see?: ");
		nums=input.nextDouble();
		
		for(natnum1 = 1; natnum1 <= nums; natnum1++)
		{			
				natnum1=Math.pow(natnum1, 2);
				sum=sum+natnum1;
				System.out.println("Your sum is: "+sum);
		}
	}

}
