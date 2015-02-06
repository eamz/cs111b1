import java.util.*;

public class PokerHands {
    public static void main(String args[]) 
    {
        final int POKER_HAND = 5;
        int[] hand = new int[POKER_HAND];

        Scanner card = new Scanner(System.in);

        System.out.println("Enter five numeric cards using 2 - 9.");

        for (int index = 0; index < POKER_HAND; index++)
        {
            System.out.print("Card " + (index + 1) + ":");
            hand[index] = card.nextInt();
        }



        System.out.println(hand[0]);

           
            if (containsAPair(hand)) 
            {
                    System.out.println("Pair!");
            } else 
                {
                    System.out.println("Not a pair!");
                }
    }
   
    public static boolean containsAPair(int hand[]) {
            


            return true;
    }
}