package ventti2;

/**
 *
 * @author Merja
 */
public class Pelikortti { //Kortti
    private String nimi; //maa
    private int arvo; //kortin arvo
    //private double opisteet = 0;
    
    //konstruktori
    public Pelikortti(String kortinmaa, int kortinarvo){ //public Kortti(String nimi, int luku)
        this.nimi=kortinmaa; //Kortin maa;
        this.arvo=kortinarvo; //Kortin arvo
    }
    
    public void setTulos(int tulos){
        this.arvo = tulos;
    }
    
    public double getTulos(){
        return arvo;
    }
    
    @Override
    public String toString(){
        return ""+ this.nimi + " "+this.arvo;
    }
}
