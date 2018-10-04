<<<<<<< Updated upstream
/*
 * Lisätään korttien tyypit 
To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti2;

/**
 *
 * @author Merja ja Samuel
 * 3.10.2018
 */
public enum Kortti {
=======

package ventti2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Kortti {
    

    public static final ArrayList<String> SUITS = new ArrayList<>(Arrays.asList(
            "Hertta", "Risti", "Pata", "Ruutu"
    ));

    public static final LinkedHashMap<String, ArrayList<Integer>> VALUES = new LinkedHashMap<>();

    static {{
        // Initialize values
        VALUES.put("ässä", new ArrayList<>(Arrays.asList(1, 14)));
        VALUES.put("kakkonen", new ArrayList<>(Arrays.asList(2)));
        VALUES.put("kolmonen", new ArrayList<>(Arrays.asList(3)));
        VALUES.put("nelonen", new ArrayList<>(Arrays.asList(4)));
        VALUES.put("vitonen", new ArrayList<>(Arrays.asList(5)));
        VALUES.put("kutonen", new ArrayList<>(Arrays.asList(6)));
        VALUES.put("seiska", new ArrayList<>(Arrays.asList(7)));
        VALUES.put("kasi", new ArrayList<>(Arrays.asList(8)));
        VALUES.put("ysi", new ArrayList<>(Arrays.asList(9)));
        VALUES.put("kymppi", new ArrayList<>(Arrays.asList(10)));
        VALUES.put("jätkä", new ArrayList<>(Arrays.asList(11)));
        VALUES.put("akka", new ArrayList<>(Arrays.asList(12)));
        VALUES.put("kurko", new ArrayList<>(Arrays.asList(13)));    
    }}
    
    private Integer arvo;
    private final String nimi;
    private final String maa;
    
    public Kortti(String nimi, String maa) {
        this.nimi = nimi;
        this.maa = maa;
    }
    
>>>>>>> Stashed changes
    
    
    
}
