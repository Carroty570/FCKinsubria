package Murilo.tests;

public class  ElementiPrecedenti {
    
    public boolean[] sommaElementiPrecedentiPari(int[] a) {
        boolean[] ris = new boolean[a.length];
        int somma = 0;
        for(int i =0; i<a.length; i++) {
        somma += a[i];
        ris[i] = (somma % 2) == 0? true:false;
        }
        return ris;
        }

}
