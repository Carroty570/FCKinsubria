package Murilo.Exercices.javahomes.javahomes;

public abstract class UnitaAbitativa {

	//CAMPI
	protected double valore = 0.0;
	protected double mq = 0.0;
	
	//COSTRUTTORI
	public UnitaAbitativa(double valore, double mq) {
		super(); //sottointesa
		this.valore = valore;
		this.mq = mq;
	}
	
	public UnitaAbitativa() {} //non necessario
	
	//METODI
	public abstract double calcolaValore();
	public abstract double calcolaMQ();
	
	@Override
	public String toString() {
		return this.getClass() + "calcolaValore = " + calcolaValore() + ", calcolaMQ = " + calcolaMQ();
	}
}
