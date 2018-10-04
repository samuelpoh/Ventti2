package ventti2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Merja
 */
public class Pakka {
    private Random Shuffles = new Random();
    public ArrayList<Kortti> Pakka = new ArrayList<Kortti>();
    Random rand = new Random();
    
    public Pakka(){
        for (int arvo =1; arvo <= 13; arvo++) {
            for (int maa=1; maa <=4; maa++) {
                Pakka.add(new Kortti(arvo, maa));
            }
        }
        shuffle();
        
        for (int i=1; i < Pakka.size(); i++) {
            System.out.println(Pakka.get(i));
        }
    }
    public void shuffle(){
        Collections.shuffle(Pakka);
    }
    
    public Kortti DrawCard() {
        int korttiPosition = Shuffles.nextInt(Pakka.size());
        return Pakka.remove(korttiPosition);
    }
    
    public int TotalCardsleft() {
        return Pakka.size();
    }
    
    public Kortti dealKortti() {
         
        if (Pakka.size() == 52) {
            shuffle();
        }
        Kortti temp;
        temp = Pakka.get(0);
        Pakka.remove(0);
        return temp;
    }
    
    public Kortti getKortti(int i) {
        return Pakka.get(i);
    }
    
    public Kortti remove(int i) {
        Kortti remo = Pakka.get(i);
        Pakka.remove(i);
        return remo;
    }
        }
        
        
    


