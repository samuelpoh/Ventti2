package OlioEsimerkit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Merja
 */
public class Peli {
    public static void main(String[] args){
        Pelikortti kortti = new Pelikortti("Hertta",2);
        kortti.setTulos(2);
        System.out.println(kortti);
        
        Pelikortti kortti2 = new Pelikortti("Hertta",3); 
        System.out.println(kortti2);
        
        //Luokka ventti = new Luokka("Ventti");
        //ventti.lisaaPelikortti(kortti);
        //ventti.lisaaPelikortti(kortti2);
                
        //System.out.println(ventti);
        
        
        List<Pelikortti> pkortit = new ArrayList<Pelikortti>();
        pkortit.add(kortti);
        pkortit.add(kortti2);
        
        
        for(Pelikortti testi:pkortit){
            System.out.println(testi);
        }
        
    }
}