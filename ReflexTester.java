import java.util.*;

class ReflexTester
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Reflexes[] watches = new Reflexes[5];
		
		for(int i = 0; i < watches.length; i++)
		{
			watches[i] = new Reflexes();
			//Random Sleep
			Thread.sleep(500 + random.nextInt(2000));
			System.out.println("HIT ENTER");

			//start timer
			watches[i].start();

			//wait for user
			input.nextLine();

			//stop timer
			watches[i].stop();

			System.out.println("Elapsed Time: " + watches[i].getElapsedTime() + " seconds");

		}

		

		

	}
}