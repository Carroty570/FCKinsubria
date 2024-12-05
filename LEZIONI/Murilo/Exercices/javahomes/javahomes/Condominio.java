package Murilo.Exercices.javahomes.javahomes;

import java.util.List;

public class Condominio extends UnitaAbitativa {

	//CAMPI
	private List<UnitaAbitativa> unitaInterne;
	
	//COSTRUTTORI
	public Condominio(List<UnitaAbitativa> unitaInterne) {
		super();
		this.unitaInterne = unitaInterne;
		valore = calcolaValore();
		mq = calcolaMQ();
	}
	
	//METODI
	public double calcolaValore() {
		double val = 0;
		for(UnitaAbitativa tmp: unitaInterne)
			val += tmp.calcolaValore();
		return val;
	}
	
	public double calcolaMQ() {
		double mq = 0;
		for(UnitaAbitativa tmp: unitaInterne)
			mq += tmp.calcolaMQ();
		return mq;
	}
	
	@Override
	public String toString() {
		return "Condominio [unit� interne: " + unitaInterne + "]";
	}
}
