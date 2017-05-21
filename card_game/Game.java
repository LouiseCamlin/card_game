package card_game;

import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private ArrayList<Card> deck;

  public Game() {
    this.players = new ArrayList<Player>();
    Deck startingDeck = new Deck();
    deck = startingDeck.getDeck();
  }

  public int playerCount() {
    return this.players.size();
  }


  public void addPlayer(Player player) {
    this.players.add(player);
  }

  public int deckSizeCount() {
    return this.deck.size();
  }

 


}