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
public class Ventti2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hei, \n" +
                "\n" +
                "tervetuloa pelaamaan!\n" +
                "\n" +
                "Kerron sinulle pelin säännöt:\n" +
                "\n" +
                "Pelaaja pelaa jakajaa vastaan. \n" +
                "Pelaaja pelaa kätensä ensin valmiiksi ja pelin voittaa se jonka käsi on lähempänä arvoa 21.\n" +
                "21 on korkein mahdollinen summa, sen ylittämällä häviää. \n" +
                "\n" +
                "Pelaaja pelaa käden ensin valmiiksi,  vasta sen jälkeen jakaja pelaa.\n" +
                "Korttien 2-10 arvo on normaali, kuvakorttien arvot ovat jätkä = 11, kuningatar = 12, kuningas = 13, Ässä = 14 tai 1.\n" +
                "\n" +
                "Lisää: Uusi kortti.\n" +
                "Stop: Ei enää uusia kortteja.\n" +
                "\n" +
                "Vuoro loppuu kun pelaaja lopettaa sen itse tai käsi menee yli 21:n(Hävisit). \n" +
                "Pelaajan käsi on ventti jos siinä on viisikorttia vaikka arvo on alle 21.\n" +
                "Ylimenon kohdalla pelaaja häviää, vaikka jakajan käsi menisi yli.\n" +
                "Jakaja voittaa tasapeli tilanteessa.\n" +
                "\n" +
                "Kun pelaaja on pelannut, jakaja pelaa. \n" +
                "Jakaja noudattaa samoja sääntöjä. \n" +
                "Jakaja näyttää käden pelin aikana.");
        
}
}