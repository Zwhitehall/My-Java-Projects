/*
 * Zion Whitehall
 * 2/27/14
 * Period 9
 * CoordinatePoint
 */
import java.util.Scanner;
public class CoordinatePoint 
{
	private double myXvalue;
	private double myYvalue;
	private double myXvalue2;
	private double myYvalue2;
	
	public CoordinatePoint()//constructor methods
	{
		myXvalue=0.0;
		myYvalue=0.0;
	}
	
	public CoordinatePoint(double Xpoint, double Ypoint)
	{
		myXvalue = Xpoint;
		myYvalue = Ypoint;
	}
	
	//getter methods
	public double getXvalue()
	{
		return myXvalue;
	}
	
	public double getYvalue()
	{
		return myYvalue;
	}
	
	//setter methods
	public void setXvalue(double Xpoint)
	{
		myXvalue = Xpoint;
	}
	
	public void setYvalue(double Ypoint)
	{
		myYvalue = Ypoint;
	}
	
	//extra object methods
	public double findDistance(CoordinatePoint thePoint)//makes new data type
	{
		double distance=Math.sqrt(Math.pow(myXvalue - thePoint.getXvalue(), 2) + Math.pow(myYvalue - thePoint.getYvalue(), 2));
		//accepts a point object and finds the distance between the point that called the method and the point that is the parameter
		return distance;
	}
	
	public double slope(CoordinatePoint thePoint)
	{
		double slope = myYvalue - thePoint.getYvalue()/myXvalue - thePoint.getXvalue();
		return slope;
	}
}
