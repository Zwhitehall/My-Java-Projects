/*
 * Zion Whitehall
 * 2/28/14
 * Period 9
 * CoordinateDriver
 */
import java.util.Scanner;
public class CoordinateDriver 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		double Xvalue, Yvalue, distance;
		
		CoordinatePoint point1=new CoordinatePoint();
		CoordinatePoint point2=new CoordinatePoint(3,4);
		
		System.out.print("Enter an x value: ");
		Xvalue = input.nextDouble();
		System.out.print("Enter a y value: ");
		Yvalue = input.nextDouble();
		
		point1.setXvalue(Xvalue);
		point2.setYvalue(Yvalue);
		
		distance=point1.findDistance(point2);
		System.out.print("The distance is: "+distance);
	}

}
