import java.util.*;

public class PokerHands {
    public static void main(String args[]) 
    {
        final int POKER_HAND = 5;
        int[] hand = new int[POKER_HAND];

        Scanner card = new Scanner(System.in);

        System.out.println("Enter five numeric cards using 2 - 9.");

        System.out.print("Card 1: ");
        hand[0] = card.nextInt();

        System.out.print("Card 2: ");
        hand[1] = card.nextInt();

        System.out.print("Card 3: ");
        hand[2] = card.nextInt();

        System.out.print("Card 4: ");
        hand[3] = card.nextInt();

        System.out.print("Card 5: ");
        hand[4] = card.nextInt();


        System.out.println(hand[0]);

           
            if (containsAPair(hand)) {
                    System.out.println("Pair!");
            } else {
                    System.out.println("Not a pair!");
            }
    }
   
    public static boolean containsAPair(int hand[]) {
            


            return true;
    }
}