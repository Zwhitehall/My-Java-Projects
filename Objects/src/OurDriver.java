
public class OurDriver 
{
	public static void main(String[] args) 
	{
		//class name varName=new ConstructorCall()
		BankAccount Jake = new BankAccount();
		BankAccount MrK= new BankAccount("Mr. K", "qwerty", 1000);
		System.out.println("Mr. K's account number is: "+MrK.getAccountNumber());
		System.out.println("Jake's name is: "+Jake.getName());
		Jake.setName("Jake");
		System.out.println("Jake's new name is: "+Jake.getName());
		System.out.println();
		System.out.println(Jake);
		System.out.println();
		System.out.println(MrK);//must reference a specific object
		//default behavior of outputting an object variable name is that the class name followed by the @memoryLocation (hexadecimal #)
		//is outputted
		
	}

}
