package ventti2;

/**
 *
 * @author Merja
 */
public class Pelikortti { //Kortti
    private final String nimi; //maa
    private final int arvo; //kortin arvo
    
    
          Public String Pelikortti() {
          String result = "";
          if (arvo == 1) result = "Ässä";
          if (arvo == 2) result = "Kaksi";
          if (arvo == 3) result = "Kolme";
          if (arvo == 4) result = "Neljä";
          if (arvo == 5) result = "Viisi";
          if (arvo == 6) result = "Kuusi";
          if (arvo == 7) result = "Seitsemän";
          if (arvo == 8) result = "Kahdeksan";
          if (arvo == 9) result = "Yhdeksän";
          if (arvo == 10) result = "Kymmenen";
          if (arvo == 11) result = "Jätkä";
          if (arvo == 12) result = "Kuningatar";
          if (arvo == 13) result = "Kuningas";
          
          if (nimi == 1) result = result + " Ruutu";
          if (nimi == 2) result = result + " Hertta";
          if (nimi == 3) result = result + " Risti";
          if (nimi == 2) result = result + " Pata";
    
          retun result;
}
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
