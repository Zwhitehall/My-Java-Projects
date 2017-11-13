/*
 * Zion Whitehall
 * 12/4/13
 * Period 9
 * Arrays
 */
import java.util.Scanner;
public class Arrays 
{
	public static void main(String[] args) 
	{
		//An array is a list of values that are referenced using a single variable name
		//Variable: int score, Array: int score[]
		//All elements in array must be the same data type
		//Array holds multiple values in one variable
		//Arrays must be declared before use
		
		//Arrays start at 0
		//last spot is the size-1
		//in arrays 5 is actually the sixth element
		
		//int score[];
		//int i=3;
		//score[i];
		
		//Arrays are only declared until created
		String[] array=new String[5];
		//or
		array = new String[5];
		//[5] refers to size of array
		//highest index will be 4
		//in general: DataType[] ArrayName = new DataType[size];
		
		//if you don't know the size of array, you can use a variable array length in order to obtain it from user input
		
		//System.out.print("How many players?: ");
		//int count = input.nextInt();
		//String[] players=new String[count]
		
		//elements:
		
		//initialize 1 by 1- 
		//String[] days=new String[7];
		//days[0]="Sunday";
		//days[1]="Monday";
		//days[6]="Saturday";
		
		//initialize in one step-
		//String[] days={"Sunday", "Monday",...,"Saturday"};
		
		//note: If you create an array first, then initialize=Too few-left with 0s in the array, Too many-compile error
		
		//initialize through user input-
		//For loops are most common loops used for cycling through arrays
		
		//int[] nums=new int[3]; This currently holds ints with values of 0 and its last element is 2
		
		//for(int i=0; i < size; i++)
		//{ System.out.print("Enter a number; ");
		//nums[i] = input.nextInt();
		//}
		
		//for(int i=0; i < 3; i++)
		//{ nums[i] = 5*nums[i];
		//} total= i + total;
		
		//is outputted differently
		//Must use for loop to output each element in a list
		
		//When the length is not known use:
		//for(int=0; i< nums.length; i++
		//Works as a failsafe
	}

}
