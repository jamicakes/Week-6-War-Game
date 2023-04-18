package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
  
  List<Card> cards = new ArrayList<Card>(); 

  Deck() {
String[] suits = {"Clubs" , "Diamond", "Hearts", "Spades"};
String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

for (String suit : suits) {
  int count = 2; 
  for (String number : numbers) {
    Card card = new Card(number, suit, count);
    this.cards.add(card) ; 
    count++;
  }
}
    
  } // Deck 
  
  public List<Card> getCards() {
    return cards;
    } // getCards 
  
  public void describe() {
    for (Card card : this.cards) {
      card.describe(); 
    }
  } // describe 
  
  public void shuffle() {
    Collections.shuffle(this.cards); 
    
  } // Shuffle
  
  public Card draw() {
    Card card = this.cards.remove(0); 
    return card;
  } // Draw 
  
} // main class Deck
