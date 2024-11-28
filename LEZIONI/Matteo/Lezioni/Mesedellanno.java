/* In è supertipo di Gamma (F)
 * I metodi astratti di Alfa sono implementati in Gamma (V)
 * Delta è una sottoclasse di Beta (F)
 * In è supertipo di Alfa (F)
 * Object è supertipo di Gamma (V)
 * In è supertipo di Beta (V)
 * Alfa è un tipo riferimento (V)
 * Alfa è il nome di un costruttore (V)
 * In è il nome di un costruttore (F)
 * Delta è una sottoclasse di Alfa (V)
 * Delta è una sottoclasse di Object (V)
 * Beta è una sottoclasse in In (F)
 * I metodi astratti di In sono implementati in Delta (V)
 * In possiede un costruttore (F)
 */

package Matteo.Lezioni;

public class Mesedellanno {



    public static void main (String args){

    
    }

    
    public static boolean isBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 !=0) || anno % 400 ==0;

    }

}

