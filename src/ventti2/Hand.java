/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

import ventti2.Card;
import java.util.ArrayList;

/**
 *
 * @author s1800590
 */
public class Hand {

    ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void clear() {
        cards.clear();
    }

    public void add(Card card) {
        cards.add(card);
    }
        public String showHand() {
        String str = "";
        boolean allFaceUp = true;
        for (Card c : cards) {
            str += c.toString() + "\n";
            if (!c.isFaceUp) {
                allFaceUp = false;
            }
        }
        if (allFaceUp) {
            str += "total points = " + getTotal() + "\n";
        }
        return str;
    }
        public void flipCards() {
            for (Card c: cards) {
                c.flipCard();
            }
        }
    public boolean give(Card card, Hand otherHand) {
        if (!cards.contains(card)) {
            return false;
        } else {
            cards.remove(cards);
            otherHand.add(card);
            return true;
        }

    }
    public int getTotal() {
        int totalPts = 0;
        boolean hasAce = false;
        for (int i = 0; i < cards.size(); i++) {
            totalPts += cards.get(i).getRank();
            if (cards.get(i).printRank() == "Ace") {
                hasAce = true;
            }
            if (hasAce && totalPts <= 11) {
                totalPts += 14;
            }
        }
        return totalPts;
    }


}
