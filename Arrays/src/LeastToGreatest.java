/*
 * Zion Whitehall
 * 12/18/13
 * Period 9
 * LeastToGreatest
 */
import java.util.Scanner;
public class LeasttoGreatest 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int nums[]=new int[3];
		
		for(int i=0; i < nums.length; i++)
		{
			System.out.print("Enter a number between 1 and 100: ");
			nums[i]=input.nextInt();
		}
		
		System.out.print("You entered your numbers in the order of: "+nums[0]);
		
		for(int i=1; i < nums.length; i++)
		{
			System.out.print(", "+nums[i]);
		}
		
		System.out.println("");
		
		System.out.println("In least to greatest order, the numbers are: ");
		
		if(nums[0]>nums[1] && nums[1]>nums[2] && nums[0]>nums[2])
		{
			System.out.print(nums[0]+","+nums[1]+","+nums[2]);
		}
		
		else if(nums[0]>nums[1] && nums[1]<nums[2] && nums[0]<nums[2])
		{
			System.out.print(nums[3]+","+nums[1]+","+nums[2]);
		}
		
		else if(nums[0]<nums[1] && nums[1]>nums[2] && nums[0]>nums[2])
		{
			System.out.print(nums[1]+","+nums[2]+","+nums[0]);
		}
		
		else if(nums[0]<nums[1] && nums[1]<nums[2] && nums[0]<nums[2])
		{
			System.out.print(nums[0]+","+nums[1]+","+nums[2]);
		}
	}

}
