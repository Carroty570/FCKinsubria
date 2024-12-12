package classe_astratta;

// creazione della classe astratta animale
abstract class Animale { 

    // Metodo astratto (sensa iplementazione)
    public abstract void emitireRumore();

    // Metodo concreto (con iplementazione)
    public void dormire() {
        System.out.println("L'animale sta dormendo.");
    }
}

// Classe concreta che eredita Animale
class Cane extends Animale {

    // Implementação do método abstrato
    public void emitireRumore() {
        System.out.println("O cane late: Au au!");
    }
}

// Un'altra classe concreta che eredita Animal
class Gato extends Animale {
    
    // Implementação do método abstrato
    public void emitireRumore() {
        System.out.println("Il gatto miagola : Miau!");
    }

}