package classi_esempio; //Camino dell'Archivo

public class Animale { //Creazione della classe Animale



    protected int eta; 
    //Qui se creano le Variabili, quindi i campi
    public String nome;


    //il "void" qua sotto significa che il metodo non ritornerà un datto
    public void mangia() { //Qui vediamo la creazione di un metodo, quindi una azione (Mangia)

        System.out.println("Sto mangiando e sono un animale generico");

    }

    public Animale(String nome) { //Creazione di un altro metodo (animale), non si mete il "Void" perchè torna il datto "Nome"

        System.out.println("ciao sono un cane di nome " + nome);

    }
}