package Matteo.Lezioni;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;


public class Lezione1211 {

    public static void main(String[] args) {

        Rettangolo r = null;

        System.out.println(r instanceof Rettangolo);
        System.out.println(r instanceof Quadrato);

        r = new Quadrato(1);

        System.out.println(r instanceof Rettangolo);
        System.out.println(r instanceof Quadrato);

        r = new Rettangolo(1, 1);

        System.out.println(r instanceof Rettangolo);
        System.out.println(r instanceof Quadrato);



        
        

    }
    
}
