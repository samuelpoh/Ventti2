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
public enum Rank {
    
    ACE(1, "ACE"), DEUCE(2, "Deuce"), THREE(3, "3"),
    FOUR(4,"4"), FIVE(5, "5"), SIX(6,"6"),
    SEVEN(7,"7"), EIGHT(8,"8"), NINE(9,"9"),
    TEN(10,"10"), JACK(11, "Jack"), QUEEN(12, "Queen"),
    KING(13, "King");
    
    private final int rankValue;
    private final String rankString;
    
    private Rank(int rankValue, String rankString) {
        this.rankValue = rankValue;
        this.rankString = rankString;
        
        
        //public Methods

    }
    
            public int getRank() {
            return rankValue;
        }
            
           public String printRank() {
               return rankString;
           }
    
}
