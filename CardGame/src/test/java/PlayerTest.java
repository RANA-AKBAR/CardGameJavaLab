import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void cadAddCardToHand(){
        player.addCard(card);
        assertEquals(1, player.handCount());
    }

}
