package card_game;

import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;

  public Player (String name) {
    this.hand = new ArrayList<Card>();
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int handSizeCount() {
    return this.hand.size();
  }

  public void addCardToHand(Card card) {
    this.hand.add(card);
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  



}