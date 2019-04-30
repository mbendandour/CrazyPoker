
import java.util.*;

public class CrazyPoker
{   
   public static void main(String[] args)
   {  
     Card temp = null;
     List<Card> p1 = new ArrayList<Card>();//ArrayList for player hands.
     List<Card> p2 = new ArrayList<Card>();
     List<Card> p3 = new ArrayList<Card>();
     List<Card> p4 = new ArrayList<Card>();
     List<Card> p5 = new ArrayList<Card>();
     int play1,play2,play3,play4,play5;
     //
     if(args.length!=19)// 
     {
        for(int i=0; i<args.length;i++)//runs through the argument
        {
           if(i<8)//player 1 8 because the first 5 community + 3 player cards.
           {
              String str = args[i];
              if(Character.toUpperCase(str.charAt(0))=='T')
              {//loops through 8 times until player has 8 cards
                 temp = new Card(10,str.charAt(1));//sets rank and suit.
              }
              else if(Character.toUpperCase(str.charAt(0))=='J')//11
              {
                 temp = new Card(11,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='Q')//12
              {
                 temp = new Card(12,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='K')//13
              {
                 temp = new Card(13,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='A')//1
              {
                 temp = new Card(1,str.charAt(1));            
              }
              else//if rank is a number.
              {
                 temp = new Card(Character.getNumericValue(str.charAt(0)),
                 str.charAt(1));       
              }
              p1.add(temp);
           }
           if((i<5) || (i>7) && !(i>10))
           {
              String str = args[i];
              if(Character.toUpperCase(str.charAt(0))=='T')
              {
                 temp = new Card(10,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='J')//11
              {
                 temp = new Card(11,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='Q')//12
              {
                 temp = new Card(12,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='K')//13
              {
                 temp = new Card(13,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='A')//1
              {
                 temp = new Card(1,str.charAt(1));            
              }
              else//if rank is a number.
              {
                 temp = new Card(Character.getNumericValue(str.charAt(0)),
                 str.charAt(1));       
              }
              p2.add(temp);       
           }
           if((i<5) || (i>10) && !(i>13))
           {
              String str = args[i];
              if(Character.toUpperCase(str.charAt(0))=='T')
              {
                 temp = new Card(10,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='J')//11
              {
                 temp = new Card(11,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='Q')//12
              {
                 temp = new Card(12,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='K')//13
              {
                 temp = new Card(13,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='A')//1
              {
                 temp = new Card(1,str.charAt(1));            
              }
              else//if rank is a number.
              {
                 temp = new Card(Character.getNumericValue(str.charAt(0)),
                 str.charAt(1));       
              }
              p3.add(temp);  
           }
           if((i<5) || (i>13) && !(i>16))
           {
              String str = args[i];
              if(Character.toUpperCase(str.charAt(0))=='T')
              {
                 temp = new Card(10,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='J')//11
              {
                 temp = new Card(11,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='Q')//12
              {
                 temp = new Card(12,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='K')//13
              {
                 temp = new Card(13,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='A')//1
              {
                 temp = new Card(1,str.charAt(1));            
              }
              else//if rank is a number.
              {
                 temp = new Card(Character.getNumericValue(str.charAt(0)),
                 str.charAt(1));       
              }
              p4.add(temp);
           }
           if((i<5) || (i>16))
           {
              String str = args[i];
              if(Character.toUpperCase(str.charAt(0))=='T')
              {
                 temp = new Card(10,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='J')//11
              {
                 temp = new Card(11,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='Q')//12
              {
                 temp = new Card(12,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='K')//13
              {
                 temp = new Card(13,str.charAt(1));
              }
              else if(Character.toUpperCase(str.charAt(0))=='A')//1
              {
                 temp = new Card(1,str.charAt(1));            
              }
              else//if rank is a number.
              {
                 temp = new Card(Character.getNumericValue(str.charAt(0)),
                 str.charAt(1));       
              }
              p5.add(temp);
           }
        }
     }
     CrazyPoker game = new CrazyPoker();
     play1 = game.dinnerParty(p1);
     play2 = game.dinnerParty(p2);
     play3 = game.dinnerParty(p3);
     play4 = game.dinnerParty(p4);
     play5 = game.dinnerParty(p5);
     
     if(play1>play2&&play2>play3&&play3>play4&&play4>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play1>play2&&play2>play3&&play3>play5&&play5>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play1>play2&&play2>play4&&play4>play3&&play3>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 5");    
     }
     else if(play1>play2&&play2>play4&&play4>play5&&play5>play3)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 3");    
     }
     else if(play1>play2&&play2>play5&&play5>play4&&play4>play3)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 3");    
     }
     else if(play1>play2&&play2>play5&&play5>play3&&play3>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 4");    
     }
     else if(play1>play3&&play3>play2&&play2>play4&&play4>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play1>play3&&play3>play2&&play2>play5&&play5>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play1>play3&&play3>play4&&play4>play2&&play2>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 5");    
     }
     else if(play1>play3&&play3>play4&&play4>play5&&play5>play2)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 2");    
     }
     else if(play1>play3&&play3>play5&&play5>play2&&play2>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 4");    
     }
     else if(play1>play3&&play3>play5&&play5>play2&&play2>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 4");    
     }
     else if(play1>play4&&play4>play2&&play2>play3&&play3>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 5");    
     }
     else if(play1>play4&&play4>play2&&play2>play5&&play5>play3)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 3");    
     }
     else if(play1>play4&&play4>play3&&play3>play2&&play2>play5)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 5");    
     }
     else if(play1>play4&&play4>play3&&play3>play5&&play5>play2)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 2");    
     }
     else if(play1>play4&&play4>play5&&play5>play2&&play2>play3)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 3");    
     }
     else if(play1>play4&&play4>play5&&play5>play3&&play3>play2)
     {
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 2");    
     }
     else if(play1>play5&&play5>play2&&play2>play3&&play3>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 4");    
     }
     else if(play1>play5&&play5>play2&&play2>play3&&play3>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 4");    
     }
     else if(play1>play5&&play5>play3&&play3>play2&&play2>play4)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 4");    
     }
     else if(play1>play5&&play5>play3&&play3>play4&&play4>play2)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 2");    
     }
     else if(play1>play5&&play5>play4&&play4>play2&&play2>play3)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 3");    
     }
     else if(play1>play5&&play5>play4&&play4>play3&&play3>play2)
     {
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 2");    
     }
     else if(play2>play1&&play1>play3&&play3>play4&&play4>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play2>play1&&play1>play3&&play3>play5&&play5>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play2>play1&&play1>play4&&play4>play3&&play3>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 5");    
     }
     else if(play2>play1&&play1>play4&&play4>play5&&play5>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 3");    
     }
     else if(play2>play1&&play1>play5&&play5>play3&&play3>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 4");    
     }
     else if(play2>play1&&play1>play5&&play5>play4&&play4>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 3");    
     }
     else if(play2>play3&&play3>play1&&play1>play4&&play4>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play2>play3&&play3>play1&&play1>play5&&play5>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play2>play3&&play3>play4&&play4>play1&&play1>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 5");    
     }
     else if(play2>play3&&play3>play4&&play4>play5&&play5>play1)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 1");    
     }
     else if(play2>play3&&play3>play5&&play5>play1&&play1>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 4");    
     }
     else if(play2>play3&&play3>play5&&play5>play4&&play4>play1)
     {
        System.out.println("Player 2");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 1");    
     }
     else if(play2>play4&&play4>play1&&play1>play3&&play3>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 5");    
     }
     else if(play2>play4&&play4>play1&&play1>play5&&play5>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 3");    
     }
     else if(play2>play4&&play4>play3&&play3>play1&&play1>play5)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 5");    
     }
     else if(play2>play4&&play4>play3&&play3>play5&&play5>play1)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 1");    
     }
     else if(play2>play4&&play4>play5&&play5>play1&&play1>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 3");    
     }
     else if(play2>play4&&play4>play5&&play5>play3&&play3>play1)
     {
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 1");    
     }
     else if(play2>play5&&play5>play1&&play1>play3&&play3>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 3");
        System.out.println("Player 4");    
     }
     else if(play2>play5&&play5>play1&&play1>play4&&play4>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 3");    
     }
     else if(play2>play5&&play5>play3&&play3>play1&&play1>play4)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 4");    
     }
     else if(play2>play5&&play5>play3&&play3>play4&&play4>play1)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 1");    
     }
     else if(play2>play5&&play5>play4&&play4>play1&&play1>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 3");    
     }
     else if(play2>play5&&play5>play4&&play4>play1&&play1>play3)
     {
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 3");
        System.out.println("Player 1");    
     }
     else if(play3>play1&&play1>play2&&play2>play4&&play4>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play3>play1&&play1>play2&&play2>play4&&play4>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play3>play1&&play1>play2&&play2>play5&&play5>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play3>play1&&play1>play4&&play4>play2&&play2>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 5");    
     }
     else if(play3>play1&&play1>play4&&play4>play5&&play5>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 2");    
     }
     else if(play3>play1&&play1>play5&&play5>play2&&play2>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 4");    
     }
     else if(play3>play1&&play1>play5&&play5>play4&&play4>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 2");    
     }
     else if(play3>play2&&play2>play1&&play1>play4&&play4>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 5");    
     }
     else if(play3>play2&&play2>play1&&play1>play5&&play5>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 4");    
     }
     else if(play3>play2&&play2>play4&&play4>play1&&play1>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 5");    
     }
     else if(play3>play2&&play2>play4&&play4>play5&&play5>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 1");    
     }
     else if(play3>play2&&play2>play5&&play5>play1&&play1>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 4");    
     }
     else if(play3>play2&&play2>play5&&play5>play4&&play4>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 1");    
     }
     else if(play3>play4&&play4>play1&&play1>play2&&play2>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 5");    
     }
     else if(play3>play4&&play4>play1&&play1>play5&&play5>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 5");
        System.out.println("Player 2");    
     }
     else if(play3>play4&&play4>play2&&play2>play1&&play1>play5)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 5");    
     }
     else if(play3>play4&&play4>play2&&play2>play5&&play5>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 5");
        System.out.println("Player 1");    
     }
     else if(play3>play4&&play4>play5&&play5>play1&&play1>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 2");    
     }
     else if(play3>play4&&play4>play5&&play5>play2&&play2>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 4");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 1");    
     }
     else if(play3>play5&&play5>play1&&play1>play2&&play2>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 2");
        System.out.println("Player 4");    
     }
     else if(play3>play5&&play5>play1&&play1>play4&&play4>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 1");
        System.out.println("Player 4");
        System.out.println("Player 2");    
     }
     else if(play3>play5&&play5>play2&&play2>play1&&play1>play4)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 1");
        System.out.println("Player 4");    
     }
     else if(play3>play5&&play5>play2&&play2>play4&&play4>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 2");
        System.out.println("Player 4");
        System.out.println("Player 1");    
     }
     else if(play3>play5&&play5>play4&&play4>play1&&play1>play2)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 1");
        System.out.println("Player 2");    
     }
     else if(play3>play5&&play5>play4&&play4>play2&&play2>play1)
     {
        System.out.println("Player 3");
        System.out.println("Player 5");
        System.out.println("Player 4");
        System.out.println("Player 2");
        System.out.println("Player 1");    
     }
     
     
     
     
     
     
     
     //Loops below are to test the players(1-5) hands
     //They share the 5 community cards(first 5) and the other 3 are their own.
     for(int i =0;i<p1.size();i++)
     {
        System.out.print(p1.get(i).getRank());
        System.out.print(p1.get(i).getSuit()+" ");
     }
     System.out.println(" ");
     for(int j =0;j<p2.size();j++)
     {
        System.out.print(p2.get(j).getRank());
        System.out.print(p2.get(j).getSuit()+" ");
     }
     System.out.println(" ");
     for(int l =0;l<p3.size();l++)
     {
        System.out.print(p3.get(l).getRank());
        System.out.print(p3.get(l).getSuit()+" ");
     }
     System.out.println(" ");
     for(int m =0;m<p4.size();m++)
     {
        System.out.print(p4.get(m).getRank());
        System.out.print(p4.get(m).getSuit()+" ");
     }
     System.out.println(" ");
     for(int n =0;n<p5.size();n++)
     {
        System.out.print(p5.get(n).getRank());
        System.out.print(p5.get(n).getSuit()+" ");
     }
     System.out.println("");
     System.out.println(play1);
   
     }
   public int dinnerParty(List<Card> cards)
   {
      return 25;//Returning the value 25. Strength of hand 25. Bottom up.
   }
}

