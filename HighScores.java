//erica martinez
//cs111b1 / spring 2015

import java.util.*;

public class HighScores
{
	public static void main (String[] args)
	{
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		initialize(names, scores);
		//sort(names, scores);
		display(names, scores);

	} 	

	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores)
	{
		Scanner userIn = new Scanner(System.in);

		int listSize = 5;

		for (int n = 0; n < listSize; n++)
		{
			System.out.print("name for score #" + (n + 1) + ": ");
			names.add(userIn.next());
			System.out.print("score #" + (n + 1) + ": ");
			scores.add(userIn.nextInt());
		}
	}

	
	public static void sort(ArrayList<String> names, ArrayList<Integer> scores)
	{
		
		
	}
	public static void display(ArrayList<String> names, ArrayList<Integer> scores)
	{
		System.out.println(scores);
		System.out.println(names);

		System.out.println("high scores:");

		for(int counter: scores)
	   	{
			System.out.println(counter);
		}
	}



}

