package collection.testE;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }


    public void drawCard(Deck deck){
        hand.add(deck.drawCard());
    }

    public String getName() {
        return name;
    }

    public int rankSum(){
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    public void showHand(){
        hand.sort(null);
        System.out.println(name + "'s cards: " + hand + ", Sum: " + rankSum());
    }

}
