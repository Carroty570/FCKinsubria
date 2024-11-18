package Murilo.Exercices.LezioneConstrutori;

public class Lezione1411main {
    
        public static void main(String[] args) {
            FrazioneCustom f1 = new FrazioneCustom(-2,4);
            FrazioneCustom f2 = new FrazioneCustom(-2,-10);
            
            System.out.println("f1 -> "+f1.toString());
            System.out.println("f2 -> "+f2.toString());
            
            System.out.println("f1.piu(f2) -> "+f1.piu(f2));
            System.out.println("f1.meno(f2) -> "+f1.meno(f2));
            System.out.println("f1.per(f2) -> "+f1.per(f2));
            System.out.println("f1.diviso(f2) -> "+f1.diviso(f2));
            
            System.out.println("f1.equals(f2) -> "+f1.equals(f2));
        }
    
}
