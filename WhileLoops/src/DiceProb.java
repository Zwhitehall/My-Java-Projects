/*
 * Zion Whitehall
 * 10/29/13
 * Period 9
 * DiceProb
 */
import java.util.Random;
public class DiceProb 
{
	public static void main(String[] args) 
	{
		Random gen=new Random();
		double dice,counter=1,counter1=0,counter2=0,counter3=0,counter4=0,counter5=0,counter6=0;
		
		while(counter<=1000000)
		{
			dice=gen.nextInt(6)+1;
			
			if(dice==1)
			{
				counter1++;
			}
			
			else if(dice==2)
			{
				counter2++;
			}
			
			else if(dice==3)
			{
				counter3++;
			}
			
			else if(dice==4)
			{
				counter4++;
			}
			
			else if(dice==5)
			{
				counter5++;
			}
			
			else if(dice==6)
			{
				counter6++;
			}
			
			counter++;
		}
		
		counter1=(counter1/1000000)*100;
		counter2=(counter2/1000000)*100;
		counter3=(counter3/1000000)*100;
		counter4=(counter4/1000000)*100;
		counter5=(counter5/1000000)*100;
		counter6=(counter6/1000000)*100;
		
		System.out.println("Rolled a 1: "+counter1);
		System.out.println("Rolled a 2: "+counter2);
		System.out.println("Rolled a 3: "+counter3);
		System.out.println("Rolled a 4: "+counter4);
		System.out.println("Rolled a 5: "+counter5);
		System.out.println("Rolled a 6: "+counter6);
		
	}

}
