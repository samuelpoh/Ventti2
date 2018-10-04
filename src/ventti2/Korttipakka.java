/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

/**
 *
 * @author s1801210
 */
import java.util.ArrayList;
import java.util.Collections;

public class Korttipakka {

    private final ArrayList<Kortti> pakka;
    
    public Korttipakka() {
        this.pakka = new ArrayList<>();

        this.init();
        this.shuffle();
        
        for (Kortti kortti : pakka) {
            System.out.println(kortti);
        }
    }

    private void init() {
        for (String suit : Kortti.SUITS) {
            for (String value : Kortti.VALUES.keySet()) {
                pakka.add(new Kortti(value, suit));
            }
        }
    }
    
    private void shuffle() {
        Collections.shuffle(pakka);
    }
}
