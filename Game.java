import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private ArrayList<Card> cards

  public Game (){
    this.players = new ArrayList<Player>();
  }

  public int playerCount() {
    return this.players.size();
  }


  public void addPlayer(Player player) {
    this.players.add(player);
  }

  // public void shuffleCards(Card cards) {
    
  // }





}