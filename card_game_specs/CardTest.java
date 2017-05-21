import static org.junit.Assert.assertEquals;
import org.junit.*;
import card_game.*;


public class CardTest {
  Card card;

  @Before
  public void before() {
    card = new Card(SuitType.HEARTS, ValueType.ONE);
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  @Test
  public void canGetValueType() {
    assertEquals(ValueType.ONE, card.getValue());
  }





}