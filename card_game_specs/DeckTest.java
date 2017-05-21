import static org.junit.Assert.assertEquals;
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
  public void canAddtoDeck(){
    deck.addCard(card);
    assertEquals(41, deck.deckCount());
  }

  @Test
  public void haveADeck() {
    assertEquals(40, deck.deckCount());
  }


}