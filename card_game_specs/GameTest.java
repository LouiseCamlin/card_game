import static org.junit.Assert.assertEquals;
import org.junit.*;
import card_game.*;

public class GameTest {

  Game game;
  Player players;
  Deck deck;
  Card card;
 

  @Before
  public void before(){
    game = new Game();
  }

  @Test
  public void canAddPlayerToGame() {
    game.addPlayer(players);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void canHaveTwoPlayersAtOnce() {
    game.addPlayer(players);
    game.addPlayer(players);
    assertEquals(2, game.playerCount());
  }

  

  

  

  




}