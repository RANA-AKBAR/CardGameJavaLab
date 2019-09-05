import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardsCount());
    }


    @Test
    public void populateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.cardsCount());
    }

    @Test
    public void shuffleDeck(){
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.cardsCount());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.cardsCount());
    }






}
