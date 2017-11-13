/*
 * Zion Whitehall
 * 11/19/2013
 * Period 9
 * GolfScores
 */
import java.util.Scanner;
public class GolfScores 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int score;
		
		for(int hole=1; hole<10; hole++)
		{
			System.out.print("What did you score on hole "+hole+": ");
			score=input.nextInt();
		}
		

	}

}
