import static org.junit.Assert.assertEquals;
import org.junit.*;


public class PlayerTest {
  Player player;
  Card card;


  @Before
  public void before() {
    player = new Player("Irma");
  }

  @Test
  public void playerHasName() {
    assertEquals("Irma", player.getName());
  }

  @Test
  public void handStartsEmpty() {
    assertEquals(0, player.handSizeCount());
  }

  @Test
  public void playerCanPickUpCard() {
    player.addCardToHand(card);
    assertEquals(1, player.handSizeCount());
  }

 
}