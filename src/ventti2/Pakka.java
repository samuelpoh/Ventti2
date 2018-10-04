package OlioEsimerkit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Merja
 */
public class Pakka {
    private String nimi;
    List<Pelikortti> kortit = new ArrayList<Pelikortti>();
    
    //konstruktori
    public Pakka(String nimi){
        this.nimi = nimi;
    }
    
    public void lisaaKortti(Pelikortti uusi){
        this.kortit.add(uusi);
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public List<Pelikortti> getKortit(){
        return this.kortit;
    }
    
    @Override
    public String toString(){
       String teksti = this.nimi;
       for(Pelikortti testi:this.kortit){
           teksti += "\n"+testi;
       }
        return teksti;
    }
}
