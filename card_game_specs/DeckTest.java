import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new Deck();
  }
 

  @Test
  public void haveADeck() {
    assertEquals(40, deck.deckCount());

  }

  @Test
  public void canRemoveCard(){
    Card card = deck.removeCard();
    assertNotNull(deck);
  }


}