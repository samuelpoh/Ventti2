
package ventti2;

import java.util.ArrayList;

/**
 *
 * @author s1801210
 */
        public class Kadet {
            private ArrayList<Peli> kadet;
            
        public void addPeli(Peli c){
            this.kadet.add(c);
            
        //You will also need method to check whether card of specific type is present:
       }
        public boolean checkPresence(int arvo){
        for(int i=0;i<kadet.size();i++){
        //komeetta
        //note you will need to implement getters to the Card class first
        if (kadet.get(i).getArvo==arvo)
        return true;
        }
        return false;
        } 
        
        
        
        }
   

         
