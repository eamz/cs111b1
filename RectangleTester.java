//notes feb26
ww
class RectangleTester
{
	
	public static void main (String[] args)
	{
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle();

		r1.setX(100);
		r1.setY(100);
		r1.setHeight(2);
		r1.setWidth(4);
		System.out.println("Area: " + r1.getArea());


		r2.setX(50);
		r2.setY(50);
		r2.setHeight(5);
		r2.setWidth(3);
		r2.getArea();
		System.out.println("Area: " + r2.getArea());

		if (r1.isLargerThan(r2))
		{
			System.out.println("r1 is larger than r2");
		}
		else
		{
			System.out.println("r2 is larger than r1");
		}



	}



}


