package card_game;

import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private ArrayList<Deck> deck;

  public Game (){
    this.players = new ArrayList<Player>();
    this.deck = new ArrayList<Deck>();
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

  public void addDeck(Deck deck) {
    this.deck.add(deck);
  }









}