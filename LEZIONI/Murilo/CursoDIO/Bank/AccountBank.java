package Murilo.CursoDIO.Bank;
import java.util.Scanner;

public class AccountBank {

        public static void main(String[] args) {
            
            
            Scanner s = new Scanner(System.in);

            System.out.print("What is your name ?> ");
            String name = s.next();

            System.out.print("Name of your agency ?> ");
            String agency = s.next();

            System.out.print("What is the number ?> ");
            int number = s.nextInt();

            System.out.print("Your balance ?> ");
            double balance = s.nextDouble();

            System.out.print("Hi, " + name + "thanks to chose our bank, your agency is: " + agency + "the number of your account is " + number + "and you have " + balance + "to withdraw");

            




           



        }

    
}



