package card_game;
import java.util.*;

public class Deck{
  
  private ArrayList<Card> deck = new ArrayList<Card>();


  public Deck() {
    this.deck = new ArrayList<Card>();
    
    SuitType[] allTheSuits = SuitType.values();
    ValueType[] allTheValues = ValueType.values();
  
    for (SuitType suit : allTheSuits){
      for (ValueType value : allTheValues){
        Card card = new Card(suit, value);
        this.deck.add(card);
      }
    }
  }

  public int deckCount() {
    return this.deck.size();
  }

  public void addCard(Card card) {
    this.deck.add(card);
  }

  }
    









  