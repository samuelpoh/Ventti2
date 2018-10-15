/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

/**
 *
 * @author s1800590
 */
public enum Suit {
    HEARTS ("Hearts"),
    SPADES ("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS ("Clubs");
    
    
    private final String suitText;
    
    private Suit(String suitText) {
        this.suitText = suitText;
    }
    
    
    public String printSuit() {
        return suitText;
    }
    
}
