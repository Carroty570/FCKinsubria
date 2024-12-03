/*Realizzare un programma che permetta a due giocatori di giocare a tris. Il giocatore di
 turno inserisce le coordinate della cella scelta(dove apporre il suo simbolo). Se il
 giocatore inserisce lecoordinate errate(fuori range oppure di una cella già usata) il
 programma richiede l’inserimento. Ad ogni mossa, il programma stampa la griglia di
 gioco e chiama la funzione finito per determinare se il gioco è finito oppure no. Se la
 scacchiera viene completata senza che nessuno dei due giocatori ha vinto, la partita è
 patta*/

package Matteo.EserciziCasa;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Tris {

    public static void main(String[] args) {


        //Inizializzazione matrice (tabella), Scanner e altre variabili
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String[][] tabella = new String[3][3];
        boolean giocatore = true;
        boolean ciclo = true;
        int n = 1;
        
        // Inizializzazione della matrice con valori vuoti
        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella[i].length; j++) {
                tabella[i][j] = "_"; // "_" indica una casella vuota
            }
        }

        //Chiede ai giocatori quale lettera vorrebbero utilizzare
        
        System.out.println("Giocatore n°1 quale lettera vorresti utilizzare ? (X/O)");
        String sceltatemp = sc.next();
        String scelta = sceltatemp.toUpperCase();
        

        while(!scelta.equals("X") && !scelta.equals("O")){
            System.out.print("Non hai inserito X o O, riprova: ");
            scelta = sc.next();
        }

        if(scelta.equals("X")){
            giocatore = true;
            
        }else {
            giocatore = false;
        }

        //Mostra la tabella iniziale

        System.out.println("\nEcco la tabella:");
        stampaMatrice(tabella);

        //Ciclo che ad ogni passaggio controlla il turno e l'eventuale vittoria di un giocatore

        while (ciclo) {

            // Dichiarazioni variabili all'interno del ciclo

            int riga = 0;
            int colonna = 0;
            boolean inputvalido = false;
            String lettera = "";
    
            //Controlla se ci sono state sovrascrizioni nella tabella
            if(controlloSovrascrizione(tabella, lettera, riga, colonna)){

            } else{
                System.out.println("\nÈ il turno del giocatore n° " + n);
            }
            
            //Ciclo while che permette di reinserire il valore in caso di InputMismatch
            while(!inputvalido){

                //Il try controlla i vaolri in caso di input mismatch
                try {

                    // Chiedi all'utente riga e colonna
                    System.out.print("Inserisci la coordinata della colonna (1-3): ");
                    colonna = sc.nextInt();
                    colonna -= 1;

                    System.out.print("Inserisci la coordinata della riga (1-3): ");
                    riga = sc.nextInt();
                    riga -= 1;

                    // Validazione degli indici
                    if (riga < 0 || riga >= tabella.length || colonna < 0 || colonna >= tabella[0].length) {
                        System.out.println("Indici non validi! Riprova.");
                        continue;
                    }
                    else{
                        inputvalido = true;
                    }
                } 
                catch (InputMismatchException e) {

                    // Eccezioni
                    System.out.println("Inserire solo numeri interi, riprovare");
                    sc.next();          
                }
            }

            //Controllo sovrascrizione 

            if(controlloSovrascrizione(tabella, lettera, riga, colonna)){
                System.out.println("La tabella che hai scelto contiene già una lettera, riprova giocatore n°" + n +" :");
                continue;
            }

            // Inserisce la lattera in bbase al giocatore

            if(giocatore){

                lettera = "X";
                giocatore = false;
                n += 1;

            }else {
                
                lettera = "O";
                giocatore = true;
                n -= 1;

            }
            
            // Inserisci la lettera nella matrice
            tabella[riga][colonna] = lettera;

            stampaMatrice(tabella);

            //Controllo vittoria
            if(controllaVittoria(tabella, lettera)){
                ciclo = false;

                if(n==1){
                    System.out.println("Congratulazioni giocatore n° 2");
                }else {
                    System.out.println("Congratulazioni giocatore n° 1");
                }
                
            }else {
                System.out.println("Prossimo giocatore: ");
            }
        } 
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

    //Controllo sovrascrizione
    public static boolean controlloSovrascrizione (String[][] matrice, String lettera, int ind1, int ind2){
        return matrice[ind1][ind2].equals("X") || matrice[ind1][ind2].equals("O");
    }
}
