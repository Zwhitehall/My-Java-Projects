/*
 * Zion Whitehall
 * 1/29/14
 * Period 9
 * PasswordChecker
 */
import java.util.Scanner;
public class PasswordChecker 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String password,password2;
		int choice=1;
		
		System.out.print("Please enter the password: ");
		password=input.next();
		System.out.print("Please retype your password: ");
		password2=input.next();
	
		while(choice==1)
		{
			if(!password2.equals(password))
			{
				System.out.print("You entered the wrong password. Try again: ");
				password2=input.next();
			}
			
			else
			{
				System.out.print("You were correct!");
				break;
			}
		}
	}

}
