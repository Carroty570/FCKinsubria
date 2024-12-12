package Matteo.Esercitazione;
import prog.utili.NumeroRomano;


public class NumeroRomano {

    public NumeroRomano somma(NumeroRomano altro){

        int a = this.getValore();
        int b = altro.getValore();
        int somma = a + b;

        NumeroRomano c = new NumeroRomano(c);
        return c;


    }

    public void MatriceNumeriRomani (int x, int y, NumeroRomano r ){

        this.m = new NumeroRomano[x][y];

        for (int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                m[i][j] = r;

            }
        }


    }

    public NumeroRomano getMaggiore(){
        NumeroRomano max = null;
        if (m==null)
            throw new MatriceNumeriRomaniException("la Matrice non è inizializzata");

        for(int i=0; i < m.length; i++)
            for(int j=0; j<m[i].length; j++)
                if (m[i][j] == null)
                    throw new MatriceNumeriRomaniException("La matrice m contiene almeno un elemento non inizializzato");

                if (max == null || max.compareTo(m[i][j])<0)
                    max = m[i][j];
            return max;
    }
    
}
