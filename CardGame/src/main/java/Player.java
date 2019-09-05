import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card){
       this.hand.add(card);
    }

//    public int valueOfHand(){
//        for (Card card : this.hand){
//            int value = card.getValue();
//        }
//
//    }


    public int handCount() {
        return this.hand.size();
    }
}
