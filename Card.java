
public class Card
{
   private int Rank;
   private char Suit;
   
   public Card(int rank, char suit)
   {
      Rank = rank;
      Suit = suit;
   }
    public int getRank()
    {
       return Rank;
    }
    public char getSuit()
    {
       return Suit;
    }
}

