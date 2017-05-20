import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GameTest {

  Game game;
  Player players;

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