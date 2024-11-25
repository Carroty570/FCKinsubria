package Murilo.Exercices.Lessons;

import java.util.LinkedList;
import java.util.Scanner;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Lezione1111 {

	public static void main(String[] args) {
		Figura rAreaMax = null, r = null;
		boolean figuraOk;
		String risposta;
		LinkedList<Figura> lista = new LinkedList<Figura>();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Che figura vuoi inserire (r/q/c)? ");
			risposta = sc.next();
			figuraOk = true;
			switch (risposta) {
				case "r": 
					System.out.print("Base > ");
					double x = sc.nextDouble();
					System.out.print("Altezza > ");
					double y = sc.nextDouble();
					while (x < 0 || y < 0) {
						System.out.println("I dati inseriti non rappresentano un rettangolo.");
						System.out.print("Base > ");
						x = sc.nextDouble();
						System.out.print("Altezza > ");
						y = sc.nextDouble();
					} 
					r = new Rettangolo(x, y);
					break;
				case "q":
					System.out.print("Lato > ");
					x = sc.nextDouble();
					while (x < 0) {
						System.out.println("I dati inseriti non rappresentano un quadrato.");
						System.out.print("Lato > ");
						x = sc.nextDouble();
					} 
					r = new Quadrato(x);
					break;
				case "c":
					System.out.print("Raggio > ");
					x = sc.nextDouble();
					while (x < 0) {
						System.out.println("I dati inseriti non rappresentano un cerchio.");
						System.out.print("Raggio > ");
						x = sc.nextDouble();
					} 
					r = new Cerchio(x);
					break;
				default: 
					figuraOk = false;
					System.out.println("Scelta non valida :-(");
				}
				if(figuraOk) {
					lista.add(r);
					System.out.println("Figura inserita: ");
					System.out.println(" " + r.toString());
					System.out.println(" area = " + r.getArea() + ", perimetro = " + r.getPerimetro());
					System.out.println();

					// confronta il rettangolo con quello di area maggiore
					if (rAreaMax == null || r.haAreaMaggiore(rAreaMax))
						rAreaMax = r;
				}
			
			System.out.println("Vuoi inserire i dati di un'altra figura? (s/n) ");
			risposta = sc.next();
		} while (risposta.equals("s"));
		
		if(rAreaMax instanceof Cerchio) 
			System.out.println("\nLa figura inserita con area max è "
					+ "un cerchio: "+rAreaMax.toString());
		else if(rAreaMax instanceof Quadrato)
		//if(rAreaMax instanceof Rettangolo && !(rAreaMax instanceof Quadrato))
			System.out.println("\nLa figura inserita con area max è "
					+ "un quadrato: "+rAreaMax.toString());
		else
			System.out.println("\nLa figura inserita con area max è "
					+ "un rettangolo: "+rAreaMax.toString());
	
		//figure inserite
		int contR=0, contQ=0, contC=0;
		System.out.println("Lista figure inserite");
		for(Figura f: lista) 
			if(f instanceof Cerchio) {
				System.out.println("Cerchio: "+f.toString());
				contC++;
			}
			else if(f instanceof Quadrato) {
				System.out.println("Quadrato: "+f.toString());
				contQ++;
			}
			else {
				System.out.println("Rettangolo: "+f.toString());
				contR++;
			}
		System.out.println("Numero di quadrati: "+contQ);
		System.out.println("Numero di rettangoli: "+contR);
		System.out.println("Numero di cerchi: "+contC);
		
		sc.close();
	}

}