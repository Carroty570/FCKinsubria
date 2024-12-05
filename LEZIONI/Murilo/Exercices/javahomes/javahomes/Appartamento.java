package Murilo.Exercices.javahomes.javahomes;

public class Appartamento extends UnitaAbitativa {

	//CAMPI
	private int piano; //0 = piano terra, 1 = primo piano, ecc...
	
	//COSTRUTTORI
	public Appartamento(double valore, double mq, int piano) {
		super(valore, mq);
		this.piano = piano;
	}
	
	//METODI
	public double calcolaValore() {
		return valore*(piano +1);
	}
	
	public double calcolaMQ() {
		return mq;
	}
}
