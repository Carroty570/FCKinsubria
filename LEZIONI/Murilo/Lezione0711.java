package Murilo;

public class Lezione0711 {
    
        public static void main(String[] args) {
            
            if(args.length == 0) {
                System.out.print("Usage: java <mainClass> [righe][colonne]...goodbye :-(");
                return;
            }
            
            int righe = Integer.parseInt(args[0]);
            int colonne = Integer.parseInt(args[1]);
            
            int[][] matrice = new int[righe][colonne];
            int cont = 1;
            
            for(int i=0; i < matrice.length; i++)
                for(int j=0; j < matrice[i].length; j++)
                    matrice[i][j] = cont++;
        
            for(int i=0; i < matrice.length; i++){
                for(int j=0; j < matrice[i].length; j++)
                    System.out.print(matrice[i][j] + " ");
                System.out.println();
            }
            
            if(matrice.length == matrice[0].length){ //matrice quadrata
                System.out.print("Diagonale [");
                int[] d = diagonale(matrice);
                for(int tmp: d)
                    System.out.print(tmp + " ");
                System.out.println("]");
            } else {
                System.out.println("Non e' possibile calcolare la diagonale!");
            }
        
        }
        
        //diagonale (solo se quadrata)
        public static int[] diagonale(int[][] m){
            int[] d = new int[m.length];
            for(int i=0; i < m.length; i++)
                d[i] = m[i][i];
            return d;
            
            /*for(int i=0; i < matrice.length; i++){
                for(int j=0; j < matrice[i].length; j++)
                    if(i==j)
                        d[i] = m[i][j];*/ //corretto, ma inutile
        }
    }
            
