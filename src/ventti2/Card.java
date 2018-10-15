/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

import testiventti2.Rank;
import testiventti2.Suit;

/**
 *
 * @author s1800590
 */
public class Card {

    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = true;

    }

    public String getSuit() {
        return suit.printSuit();
    }

    public void flipCard() {
        isFaceUp = !isFaceUp;
    }

    public int getRank() {
        return rank.getRank();
    }

    public String printRank() {
        return rank.printRank();
    }

    @Override
    public String toString() {
        String str = "";
        if (isFaceUp) {
            str += rank.printRank() + " of "
                    + suit.printSuit();
        } else {
            str = "Face Down (nothing to see here";
        }
        return str;
    }

}
