package interfacia;

interface mezzo {
    void ligare();
    void spegnere();
}

class MachinaEletrica implements mezzo {
    @Override
    public void ligare() {
        System.out.println("Machina eletrica turned on.");
    }

    @Override
    public void spegnere() {
        System.out.println("Machina a benzina spenta.");
    }
}

class Benzina implements mezzo {
    @Override
    public void ligare() {
        System.out.println("Machina benzina turned on.");
    }

    @Override
    public void spegnere() {
        System.out.println("Machina a benzina spenta.");
    }
}

public class es_interfacia {
    public static void main(String[] args) {
        mezzo tesla = new MachinaEletrica();
        mezzo ford = new Benzina();

        tesla.ligare();
        ford.ligare();
        tesla.spegnere();
        ford.spegnere();
    }
}

