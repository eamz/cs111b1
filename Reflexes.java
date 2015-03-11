
class Reflexes
{
	long startTime;
	long endTime;

	public void start()
	{
		startTime = System.currentTimeMillis();
	}

	public void stop()
	{
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime()
	{
		return (endTime - startTime) / 1000.0;
	}

}