package classe_astratta;

public class Main {
    public static void main(String[] args) {

        Animale cane = new Cane(); // Istanziare una subclasse
        Animale gato = new Gato(); //Istanziare una subclasse

        // Chiamando metodi 
        cane.emitireRumore();  //  O cane late: Au au!
        cane.dormire();        //  L'animale sta dormendo.
        gato.emitireRumore();  //  Il gatto miagola : Miau!
        gato.dormire();        // L'animale sta dormendo.
    }
}
