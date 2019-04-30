# CrazyPoker
A Texas Hold'em program that determines the ranked order of the hands and who beats who from a list of players.

## About
The program will receive an input array of five players and their cards/rankings. Example: java CrazyPoker 2c 3s 6d 7s 8h Kh Jd 4d Jc Kc Qc Tc 9c Jh 9s 9h 9d Qs Ks Js

## Rankings
Non-Rainbow 2| 3| 4| 5} 8} J~ You don't have at least one of each suit.

1 pair J| J} 4} 8~ 7~ 5} You have two cards of the same rank.

Rainbow 8| 4~ 6} Q K A| You have one of each suit.

2 pair 8~ 8} A~ A| 3~ 7| You hold four cards that consist of only two ranks.

Three of a kind 2~ 3~ 4| 4} 4| 9 You have three cards of the same rank.

Swingers K Q 8} 3~ K} Q} You have two sets of suited Kings and Queens.

5 card straight 3} 7~ 8| 9 T~ J} You hold ve cards in numerical sequence (A is either 1 or 13).

Monochromatic 8} 4} Q~ 4} 9~ K} Your cards are either all black or all red.

Full house 4~ 4} 8| Q Q Q You hold both a pair of something and three of a kind.

3 pair: 4 4} 8| 8} 9~ 9 Cards consist of exactly three unique ranks.

Monarchy: 4 8 T~ J Q K A Jack, Queen and King of the same suit and no other face cards.

Even: 2~ 4 6} 8| T| T~ All your cards are a 2,4,6,8 or 10.

6 card straight: 6} 7~ 8| 9 T~ J} You have six cards in numerical order (like 5 card straight but 6).

Four of kind: 6| 6} 6 6~ 8~ 9} You hold four of a kind.

Odd: 3 5~ 7} 7} 9| 9 All of your cards are a 3,5,7 or 9.

Flush: 3 5 6 7 J Q All six of your cards are the same suit.

Triplets: 3 3} 3~ T} T| T~ You have two dierent three of a kinds.

Overfull house: 5 5} 5~ 5| J J| Four of a kind and a pair.

Homosapiens: J J} J| Q Q} K| All your cards are face cards.

Kingdom: 4 8 T J Q K (Monarchy + Flush) a Monarchy with remaining cards of the same suit!

5 card straight flush: 3} 7} 8} 9} T} J} 5 cards straight but all six cards are the same suit.

6 card straight flush: 6} 7} 8} 9} T} J} 6 cards straight all in the same suit.

Orgy: J J} J| J~ Q Q~ All your cards are Jacks and Queens.

Politics: J J} Q Q} K K} You hold two Monarchys.

Dinner party: Q Q} Q~ K K} K~ All your cards are suited kings and queens.
