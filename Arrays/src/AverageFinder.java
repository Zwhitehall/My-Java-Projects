/*
 * Zion Whitehall
 * 12/5/13
 * Period 9
 * AverageFinder
 */
import java.util.Scanner;
public class AverageFinder 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		double total=0,average=0;
		int[] nums=new int[6];
		
		for (int j = 0; j < nums.length; j++) 
		{
			System.out.print("Please enter your number: ");
			nums[j]=input.nextInt();
			total=total+nums[j];
			average=total/6;
		}
		
		System.out.println("Your average is: "+average);
		
		
	}

}
