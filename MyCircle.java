//erica martinez
//cs111b1 / spring2015

import java.util.*;
import java.lang.Math;

class MyCircle
{
	double x;
	double y;
	double radius;
	double distance;

	public void setX(double value)
	{
		x = value;
	}

	public double getX()
	{
		return x;
	}

	public void setY(double value)
	{
		y = value;
	}

	public double getY()
	{
		return y;      
	}

	public void setRadius(double value)
	{
		radius = value;
	}

	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{
		
		return Math.PI * (radius * radius);

	}

	public boolean doesOverlap(MyCircle otherCircle)
	{
		distance = Math.sqrt(Math.pow((getX() - otherCircle.getX()), 2) + Math.pow((getY() - otherCircle.getY()), 2));     

		//TEST MATH LOGIC
		//System.out.println("Distance: " + distance);
		//System.out.println("r1 + r2: " + (getRadius() + otherCircle.getRadius()));
		
		return distance < (getRadius() + otherCircle.getRadius());
	}

}

