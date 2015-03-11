//notes feb 26
import java.util.*;

class MyRectangle
{
	double x;
	double y;
	double width;
	double height;
	double area;

	public void setX(double value)
	{
		x = value;//pre-defined in the class
	}

	public void setY(double value)
	{
		y = value;
	}

	public void setHeight(double value)
	{
		height = value;
	}
	
	public void setWidth(double value)
	{
		width = value;
	}

	public double getArea()
	{
		return width * height;
	}


	public boolean isLargerThan(MyRectangle other)
	{
		//"MyRectangle other" is a temporary variable when this method is invoked.
		//return (height * width) > other.getArea(); turns into..

		return getArea() > other.getArea(); //already a boolean espression, no need to make if statement

		// or
		// return this.getArea() > other.getArea();
		// "this." refers to what is being invoked
	}


	 
}


