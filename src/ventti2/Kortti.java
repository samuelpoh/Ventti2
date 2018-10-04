
package ventti2;

public class Kortti { //Kortti
    
    

    private final int nimi; //maa
    private final int arvo; //kortin arvo

    /**
     *
     * @return
     */
    public int Pelikortti() {
          String tulos = "";
          if (arvo == 1) tulos = "Ässä";
          if (arvo == 2) tulos = "Kaksi";
          if (arvo == 3) tulos = "Kolme";
          if (arvo == 4) tulos = "Neljä";
          if (arvo == 5) tulos = "Viisi";
          if (arvo == 6) tulos = "Kuusi";
          if (arvo == 7) tulos = "Seitsemän";
          if (arvo == 8) tulos = "Kahdeksan";
          if (arvo == 9) tulos = "Yhdeksän";
          if (arvo == 10) tulos = "Kymmenen";
          if (arvo == 11) tulos = "Jätkä";
          if (arvo == 12) tulos = "Kuningatar";
          if (arvo == 13) tulos = "Kuningas";
          
          
          if (nimi == 1) tulos = tulos + " Ruutu";
          if (nimi == 2) tulos = tulos + " Hertta";
          if (nimi == 3) tulos = tulos + " Risti";
          if (nimi == 2) tulos = tulos + " Pata";
    
          return arvo;
}
    public Kortti(int arvo, int tulos) {
        this.arvo = arvo;
        this.nimi = tulos;
    }
}