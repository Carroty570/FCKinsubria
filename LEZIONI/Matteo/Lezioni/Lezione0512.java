package Matteo.Lezioni;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lezione0512 {

    public static void main(String[] args) throws IOException {
        
        //costruzione dello stream di caratteri
        
        try{
            FileReader frd = new FileReader(".\\docs\\ProvaReader.txt");
            int i;
            
            //lettura e visualizzazione
            while ((i = frd.read()) != -1){
                System.out.println((char)i);
            }
            frd.close();

        } catch (FileNotFoundException e){
            System.err.print("File non trovato...bye!");
        }
        
    }
    
}
