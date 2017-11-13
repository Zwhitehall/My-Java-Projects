/*
 * Zion Whitehall
 * 1/31/14
 * Period 9
 * WordScrambler
 */
import java.util.Scanner;
import java.util.Random;
public class WordScrambler 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Random gen=new Random();
		String word;
		int length,randNum,flag=0;//assume 0 means index spot is not used yet
		char indspot;
		
		System.out.print("Please enter a word: ");
		word=input.next();
		length=word.length();
		indspot=word.charAt(word.length()-1);
		char strhldr[]=new char[length], strhldr2[]=new char[length];
		int usedIndexSpots[]=new int[length];
		//uses 3 arrays
		//one holds original, one holds scrambled word, one holds index spots
		//generate random number between 0 and 3
		//fill index spot array with numbers the array can't generate
		//check to see if the index spot generated has been used before
		//if it was generated, generate a different index spot
		//if it wasn't generated, use it
		
		for(int i = 0; i < strhldr.length; i++)
		{
			strhldr[i]=word.charAt(i);
		}
		
		for(int k = 0; k < usedIndexSpots.length; k++)//for loop holds numbers that the second for loop can't generate
		{
			usedIndexSpots[k]=-1;
		}
		
		
		System.out.print("Your scrambled word is: ");
		for(int j = 0; j < strhldr.length; j++)
		{
			randNum=gen.nextInt(strhldr.length);
			
			//here you need a for loop that's going through the usedIndexSpot array, and you need to check to see if your randomNum
			//is already used (which means it's in the usedIndexSpot array)
			//if we find that our randNum is already in the usedIndexSpot array, we're going to set flag = 1 
			//flag = 1 means that the index spot is no good.
			//
			for(int l = 0; l < usedIndexSpots.length; l++)
			{
				
				if(randNum==usedIndexSpots[])//if the random number was used
				{
					flag = 1;
				}
				
				if(flag == 0)//if the random number generated was not used
				{
					indspot=word.charAt(randNum);//input the random number into the charAt prompt for the word
				}
			}
			
			
			
			System.out.print(strhldr[j]);
		}
		
		
	}

}
