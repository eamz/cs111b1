class CircleTester
{

	public static void main (String[] args)
	{	
		MyCircle c1 = new MyCircle();
		MyCircle c2 = new MyCircle();
		MyCircle c3 = new MyCircle();

		c1.setX(4);
		c1.setY(4);
		c1.setRadius(1);
		System.out.println("Area: " + c1.getArea());

		c2.setX(7);
		c2.setY(7);
		c2.setRadius(2);
		System.out.println("Area: " + c2.getArea());

		c3.setX(10);
		c3.setY(10);
		c3.setRadius(3);
		System.out.println("Area: " + c3.getArea());

		if (doesOverlap())
		{
			System.out.println("There is an overlap.");
		else
		{
			System.out.println("There is no overlap.");
		}
	}
}