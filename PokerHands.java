//erica martinez
//cs111b1 spring 15


import java.util.*;

public class PokerHands {
    public static void main(String args[]) 
    {
       
        //bucket to store card tally
        //cardcount[0] reps (2), cardcount[1] reps (3)... [7] is 9)
        final int CARD_VALS = 8;
        int[] cardCount = new int[CARD_VALS];

        for (int cardIndex = 0; cardIndex < CARD_VALS; cardIndex++)
        {
            cardCount[cardIndex] = 0;    
        }
      

        final int POKER_HAND = 5;
        int[] hand = new int[POKER_HAND];

        Scanner card = new Scanner(System.in);

        System.out.println("Enter five numeric cards using 2 - 9.");

        for (int index = 0; index < POKER_HAND; index++)
        {
            System.out.print("Card " + (index + 1) + ":");
            hand[index] = card.nextInt();
            cardCount[hand[index] -2]++;
           
        }

         //what kind of hand?
         //highest hand first  
            if (containsFourOfaKind(cardCount))
            {
                System.out.println("four of a kind.");
            }
                else if (containsFullHouse(cardCount))
                {
                    System.out.println("full house.");
                }
                else if (containsStraight(cardCount))
                {
                    System.out.println("straight.");
                }
                else if (containsThreeOfaKind(cardCount)) 
                {
                    System.out.println("three of a kind.");
                } 
                else if (containsTwoPair(cardCount))
                {
                    System.out.println("two pair.");
                }
                else if (containsAPair(cardCount)) 
                {
                    System.out.println("one pair.");
                } 
                else 
                {
                    System.out.println("high card.");
                }

        
        /*test -- view bucket tally 
        for (int i = 0; i < 8; i++)
        {
            System.out.println(cardCount[i]);
        }
        **///END OF TEST
    }
    
    public static boolean containsAPair(int cardCount[]) 
    {
        for (int a = 0; a < cardCount.length; a++)
        {    
            if (cardCount[a] == 2)
            {
                return true;
            }            
        }

        return false;

    }

    public static boolean containsTwoPair(int cardCount[])
    {
        
        for(int i = 1; i < cardCount.length + 1; i++)
        {
            if (cardCount [0] == 2 && cardCount[i] == 2)
            {
                return true;
            }
                
        } 
        
        for(int j = 1; j < cardCount.length + 1; j++)
        {
            if (cardCount [1] == 2 && cardCount[j] == 2)
            {
                return true;
            }
                
        }   

        return false;            
    
    }
    
    public static boolean containsThreeOfaKind(int cardCount[])
    {
       for (int c = 0; c < cardCount.length; c++)
       { 
            if (cardCount[c] == 3)
            {
                return true;
            } 
        }

        return false;
    }
    
    public static boolean containsStraight(int cardCount[])
    {
       for (int b = 0; b < 4; b++)
       {
            if (cardCount[b] == 1 && cardCount[b + 1] == 1 && cardCount[b + 2] == 1 && cardCount[b + 3] == 1 && cardCount[b + 4] == 1)
            {
                return true;
            }
       }

       return false;
    }
    
    public static boolean containsFullHouse(int cardCount[])
    {
        if (containsAPair(cardCount) && containsThreeOfaKind(cardCount))
        {
            return true;
        } 
            
        
        return false;
        
    }
    
    public static boolean containsFourOfaKind(int cardCount[])
    {
        for (int d = 0; d < cardCount.length; d++)
        {    
            if (cardCount[d] == 4)
            {
                return true;
            }            
        }

        return false;
    }


}