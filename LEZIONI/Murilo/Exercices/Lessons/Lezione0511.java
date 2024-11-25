package Murilo.Exercices.Lessons;

import java.util.LinkedList;
import java.util.Scanner;

public class Lezione0511 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.print("*** WELCOME ***\nInserire una stringa (stringa vuota per terminare) > ");
		s = sc.nextLine();
		while(!s.equals("")){
			list.add(s);
			System.out.print("Inserire una stringa (stringa vuota per terminare) > ");
			s = sc.nextLine();
		}
		
		//stampa lista in ordine
		System.out.println("\n*** LISTA IN ORDINE DI INSERIMENTO (for-each) ***");
		for(String tmp: list)
			System.out.print(tmp + " ");
		
		System.out.println("\n*** LISTA IN ORDINE DI INSERIMENTO (for) ***");
		for(int i=0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		//stampa lista in ordine inverso
		System.out.println("\n*** LISTA IN ORDINE INVERSO (modo 1) ***");
		for(int i=list.size()-1; i >= 0; i--)
			System.out.print(list.get(i) + " ");
		
		System.out.println("\n*** LISTA IN ORDINE INVERSO (modo 2) ***");
		for(int i=0; i < list.size(); i++)
			System.out.print(list.get(list.size()-1-i) + " ");
		
		//ottenere l'elemento in posizione pos
		System.out.print("\nInserire una posizione > ");
		int pos = sc.nextInt();
		
		if(pos >= 0 && pos < list.size()) {
			s = list.get(pos);
		
			//eliminare l'elemento in posizione pos
			list.remove(s);
			//list.remove(pos);
			
			//stampa lista in ordine
			System.out.println("\n*** LISTA MODIFICATA (for-each) ***");
			for(String tmp: list)
				System.out.print(tmp + " ");
		}
		
		System.out.println("\n*** ARRAY ***");
		String[] arrayS = new String[list.size()];
		String[] array = list.toArray(arrayS);
		for(String tmp: array)
			System.out.print(tmp + " ");
		
		//lista in ordine inverso
		System.out.println("\n*** LISTA nuova IN ORDINE INVERSO ***");
		LinkedList<String> listReverse = new LinkedList<String>();
		for(String tmp: array)
			listReverse.addFirst(tmp);
		for(String tmp: listReverse)
			System.out.print(tmp + " ");
		
		//svuota lista
		System.out.println("\n*** LISTA VUOTA ***");
		list.clear();
		for(String tmp: list)
			System.out.print(tmp + " ");
		
	}
}
