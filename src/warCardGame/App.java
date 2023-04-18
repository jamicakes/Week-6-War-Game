package warCardGame;

public class App {

  public static void main(String[] args) {
   Deck gameDeck = new Deck ();
   gameDeck.shuffle();
   
   Player player1 = new Player("player1");
   Player player2 = new Player("player2");

   for(int i = 1; i <= 26; i++){        //iterates 26 cards to each player's hand
     player1.hand.add(gameDeck.draw()); 
     player2.hand.add(gameDeck.draw());
       
 } // dealing hand 
   // describe players 
   player1.describe();
   player2.describe();
   
   for (int i = 1; i <= 26; i++){ 
     Card playerOneCard = player1.flip();
     System.out.print("Player 1 card: " );
     playerOneCard.describe();

     Card playerTwoCard = player2.flip();
     System.out.print("Player 2 card: ");
         playerTwoCard.describe();
         System.out.println();
     
     if (playerOneCard.getValue() > playerTwoCard.getValue()) {
      player1.incrementScore();
System.out.println("Player one wins this round!" + " Score update: " + player1.getScore());
    
     } 
     else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
       player2.incrementScore();
       System.out.println("Player two wins this round!" + " Score update: " + player2.getScore());
     
     }
     else  System.out.println("It's a draw!"); {
   }
   }
   
   
   if (player1.getScore() > player2.getScore()) {
     System.out.println("Player 1 Wins!!!");
   
   } else if (player2.getScore() > player1.getScore()) {
     System.out.println("Player 2 Wins!!!");
   }
   else { System.out.println("It's a draw!");
   }
   

  } // main method 

}// main App class 
