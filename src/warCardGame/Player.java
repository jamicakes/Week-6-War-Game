package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
  
  List<Card> hand = new ArrayList<Card>();
  int score;
  String name; 
  
  Player(String name) {
    this.name = name; 
    this.score = 0;
      
  }
  
    
  public String getName() {
    return name;
    
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Card> getHand() {
  return hand; 
  }
  
  public void setHand(List<Card> hand) {
    this.hand = hand; 
  }
  
  public int getScore() {
    return score;
  }
  
  public void setScore(int score) {
    this.score = score;
   
  }
  public void describe() { 
    //System.out.println(player name, calls describe method for each card in the Hand List);
    System.out.println("\nPlayer " + name + " " + "has " + score + " points!\n");
    for(Card card : hand) {
        card.describe();
    }
  
System.out.println("*****************************************");
    
  } // describe 
  
  public Card flip() {
    // removes and return the top card of the Hand
    Card drawnCard = hand.get(0);
    hand.remove(0);
    return drawnCard;
  } // flip 
  
  public void draw(Deck deck) {
    // takes a Deck as an argument and calls the draw method on the deck, adding the returned card to the hand field 
    Card card = deck.draw();
    hand.add(card);
  } // draw
  
  public void incrementScore() { 
    // adds 1 to the Player's score field
    this.score++;
  } // increment score 
  
  
} // class Player 
