import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void checkDealerHasDeck(){
        assertEquals(52, deck.cardsCount());
    }



}
