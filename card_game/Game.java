package card_game;

import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private ArrayList<Card> deck;

  public Game (){
    this.players = new ArrayList<Player>();
    this.deck = new ArrayList<Card>();
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