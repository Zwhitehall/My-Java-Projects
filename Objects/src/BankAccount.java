import java.util.Random;
import java.util.Scanner;
public class BankAccount 
{
	private String myName;
	private String myPassword;
	private double myAmount;
	private int myAccountNumber;
	private Random gen = new Random();
	
	//1. a constructor must always be public
	//2. no return type or void keyword
	public BankAccount()//default constructor
	{
		myName = null;//empty object
		myPassword = null;
		myAmount = 0.0;
		myAccountNumber = 0;
	}
	
	public BankAccount(String name, String password, double amount)
	{
		myName = name;
		myPassword = password;
		myAmount = amount;
		myAccountNumber = gen.nextInt(999999-100000+1)+100000;
	}
	
	//getter methods
	public String getName()
	{
		return myName;
	}
	
	public String getPassword()
	{
		return myPassword;
	}
	
	public double getAmount()
	{
		return myAmount;
	}
	
	public int getAccountNumber()
	{
		return myAccountNumber;
	}
	
	//setter methods get new values 
	public void setName(String name)//must be void
	{
		myName = name;
	}
	
	public void setPassword(String password)
	{
		myPassword = password;
	}
	
	public void setAmount(double amount)
	{
		myAmount = amount;
	}
	
	public void setAccountNumber(int AccountNumber)
	{
		myAccountNumber = gen.nextInt(999999-100000+1)+100000;
	}
	
	public void deposit(double depositeAmount)
	{
		myAmount+=depositeAmount;
	}
	
	public void withdray(double withdrawAmount)
	{
		myAmount-=withdrawAmount;
	}
	
	//last method in class is toString method
	//default behavior of toString is to output ClassName@memoryLocation
	//just simply using System.out.print(Object var name) automatically calls toString method
	//we can override the toString method so that it outputs object meaningfully
	//we generally want to do this in our classes
	
	
	public String toString()
	{
		String rep="";
		
		rep = "The name of this account is "+myName+"\nThey have "+myAmount+" dollars in their account\nTheir account number is "+myAccountNumber;
		// \n is an enter key
		
		return rep;
	}
	
	//1. public John = new BankAccount();
	//{
	//	hisName = "Conrad";
	//	hisPassword = "thisisnotsecure"
	//	hisAmount = "5000.50"
	//}
	
	//2. public void setName(String Name)
	//{
	//	hisName = "Johnny Boy";
	//}
	
	//public void setAccountNumber
	//{
	//	AccountNumber = 123456;
	//}
	
	//public void setPassword
	
	
}