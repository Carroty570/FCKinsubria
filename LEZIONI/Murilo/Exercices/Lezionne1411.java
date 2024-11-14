package Murilo.Exercices;

import prog.utili.Frazione;

public class Lezionne1411 {
    
    public static void main(String[] args) {
        
        //CAMPI

        private int num;
        private int den;

        //CONSTRUTORI

        public Lezionne1411(int num, int den){

            this.num = num;
            this.den = 1;

        }

        public Lezionne1411(int num){

            int x = 5;
            this(num, 1);

        }

        //METODI

        public Frazione per(FrazioneCustom altra) {

            int n = this.num*altra.num;
            int n = this.den*altra.den;
            FrazioneCustom ris = new FrazioneCustom(n, d);
            return ris;
            

        }


    }



}
