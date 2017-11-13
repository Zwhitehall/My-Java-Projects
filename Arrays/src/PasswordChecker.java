/*
 * Zion Whitehall
 * 12/5/12
 * Period 9
 * PasswordChecker
 */
import java.util.Scanner;
import java.util.Random;
public class PasswordChecker 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Random gen=new Random();
		int password,answer,choice=1,nums[]=new int[4];
		
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print("Please input number "+i+": ");
			nums[i]=input.nextInt();
		}
		
		System.out.print("Your numbers are: "+nums[0]);
		for(int i = 1; i < nums.length; i++)
		{
			System.out.print(", "+nums[i]);
		}
		
		System.out.println("");
		
		while(choice==1)
		{
			password=gen.nextInt((nums[3]-nums[0])+1);
			answer=nums[2];
			
			if(password!=answer)
			{
				System.out.println("Program has guessed the wrong number. Attempting once more...");
			}
			
			if(password==answer)
			{
				System.out.println("Password discovered!: "+password);
				break;
			}
			
			
		}
	}

}
