/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

import testiventti2.Hand;
import ventti2.Deck;

/**
 *
 * @author s1800590
 */
public class Game {
    public static void main(String[] args) {
//Create Deck
Deck d1 = new Deck();
d1.populate();
d1.shuffle();


// Create our playing hands
Hand h1, dealer;
h1 = new Hand();
dealer = new Hand();
Hand[] hands = {h1, dealer};


//deal cards to our hands
d1.deal(hands, 2);
//deal 2 cards to dealer
d1.deal(dealer,2);
//show the players hand
for (int i=0; i<hands.length; i++) {
    hands[i].flipCards();
    System.out.println(hands[i].showHand());
}
//flip the dealers first card
dealer.cards.get(0).flipCard();
//show the dealers cards
System.out.println("\nDealer's Cards: \n" + dealer.showHand());

//KESKEN!!!!!!
        
    }
    
}
