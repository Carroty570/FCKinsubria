package Murilo.Exercices.javahomes.javahomes;

import java.util.ArrayList;
import java.util.List;

public class ProvaUnitaAbitative {

	public static void main(String[] args) {
		//lista vuota di unit� abitative
		List<UnitaAbitativa> lista = new ArrayList<UnitaAbitativa>();
		
		//creazione di due appartamenti
		UnitaAbitativa ua1 = new Appartamento(100, 20, 0);
		UnitaAbitativa ua2 = new Appartamento(200, 20, 1);
		
		System.out.println(ua1);
		System.out.println(ua2);
		
		//aggiunta appartamenti alla lista
		lista.add(ua1);
		lista.add(ua2);
		
		//creazione condominio
		UnitaAbitativa c1 = new Condominio(lista);
		
		System.out.println(c1);
		System.out.println("Valore c1: "+c1.calcolaValore());
		System.out.println("MQ c1: "+c1.calcolaMQ());
		
		//lista vuota di unit� abitative
		List<UnitaAbitativa> lista2 = new ArrayList<UnitaAbitativa>();
		
		//aggiunta elementi
		lista2.add(c1);
		lista2.add(new Appartamento(300, 40, 2));
		
		//creazione condominio
		UnitaAbitativa c2 = new Condominio(lista2);
		
		System.out.println(c2);
		System.out.println("Valore c2: "+c2.calcolaValore());
		System.out.println("MQ c2: "+c2.calcolaMQ());
	}

}
