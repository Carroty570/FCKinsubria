/*Realizzare un programma che permetta a due giocatori di giocare a tris. Il giocatore di
 turno inserisce le coordinate della cella scelta(dove apporre il suo simbolo). Se il
 giocatore inserisce lecoordinate errate(fuori range oppure di una cella già usata) il
 programma richiede l’inserimento. Ad ogni mossa, il programma stampa la griglia di
 gioco e chiama la funzione finito per determinare se il gioco è finito oppure no. Se la
 scacchiera viene completata senza che nessuno dei due giocatori ha vinto, la partita è
 patta*/

package Matteo.EserciziCasa;
import java.util.Scanner;


public class Tris {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] tabella = new String[3][3];
        int riga, colonna;
        

        // Inizializzazione della matrice con valori vuoti
        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella[i].length; j++) {
                tabella[i][j] = "_"; // "_" indica una casella vuota
            }
        }

        boolean continua = true;
        while (continua) {
            // Stampa la matrice attuale
            System.out.println("\n Questa è la matrice di partenza:");
            stampaMatrice(tabella);

            try {
                  // Chiedi all'utente riga e colonna
            System.out.print("Inserisci l'indice della riga (0-2): ");
            riga = sc.nextInt();

            System.out.print("Inserisci l'indice della colonna (0-2): ");
            colonna = sc.nextInt();

            } catch (Exception InputMismatchException) {
                // TODO: handle exception
                System.out.println("Input errato, riprovare");

                System.out.print("Inserisci l'indice della riga (0-2): ");
                riga = sc.nextInt();

                System.out.print("Inserisci l'indice della colonna (0-2): ");
                colonna = sc.nextInt();

            }

            // Validazione degli indici
            if (riga < 0 || riga >= tabella.length || colonna < 0 || colonna >= tabella[0].length) {
                System.out.println("Indici non validi! Riprova.");
                continue;
            }

            // Chiedi la lettera da inserire
            
            System.out.print("Inserisci X o O: ");
            String lettera = sc.next();
            
            while (!lettera.equals("X") && !lettera.equals("O")){
                System.out.print("Lettera errata, riprovare: ");
                lettera = sc.next();
            }

            // Inserisci la lettera nella matrice
            tabella[riga][colonna] = lettera;

            //Controllo vittoria
            if(controllaVittoria(tabella, lettera)){
                continua = false;
                System.out.println("Vittoria");
            }

            else {
                System.out.println("Prossimo giocatore: ");
            }   

    } stampaMatrice(tabella);

}

    //Determinare se il gioco è finito
    public static boolean controllaVittoria(String[][] matrice, String simbolo) {
        // Controlla righe
        for (int i = 0; i < matrice.length; i++) {
            if (matrice[i][0].equals(simbolo) && matrice[i][1].equals(simbolo) && matrice[i][2].equals(simbolo)) {
                return true;
            }
        }

        // Controlla colonne
        for (int j = 0; j < matrice[0].length; j++) {
            if (matrice[0][j].equals(simbolo) && matrice[1][j].equals(simbolo) && matrice[2][j].equals(simbolo)) {
                return true;
            }
        }

        // Controlla diagonali
        if (matrice[0][0].equals(simbolo) && matrice[1][1].equals(simbolo) && matrice[2][2].equals(simbolo)) {
            return true;
        }
        if (matrice[0][2].equals(simbolo) && matrice[1][1].equals(simbolo) && matrice[2][0].equals(simbolo)) {
            return true;
        }

        // Nessuna vittoria trovata
        return false;
    }

    //Stampa della matrice

    public static void stampaMatrice(String[][] matrice) {
        if (matrice == null || matrice.length == 0) {
            System.out.println("Matrice vuota o nulla.");
            return;
        }

        for (int i = 0; i < matrice.length; i++) { // Ciclo sulle righe
            for (int j = 0; j < matrice[i].length; j++) { // Ciclo sulle colonne
                System.out.print((matrice[i][j] != null ? matrice[i][j] : "null") + " ");
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }
    }

}
