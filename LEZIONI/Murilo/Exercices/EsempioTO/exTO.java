package Murilo.Exercices.EsempioTO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class exTO {

    public static void main(String[] args) throws IOException{

        

        try {

            FileReader frd = new FileReader(".\\src\\esempi\\prova.txt");
            
           int i;
           while ((i = frd.read()) != -1) {
            
            System.out.println((char)i);
            
           }
  
        frd.close();

        } catch (FileNotFoundException e) {
            System.err.println("FIle non trovato...");
     
        }
        
    }
    
}
