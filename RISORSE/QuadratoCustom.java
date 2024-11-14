package RISORSE;

public class QuadratoCustom extends RettangoloCustom {
	
	//COSTRUTTORI
	public QuadratoCustom(double lato) {
		super(lato, lato); //per forza la prima istruzione del costruttore
	}
	
	//METODI
	public double getLato() {
		return super.getBase();
	}
	
	@Override
	public String toString() {
		return "Quadrato con lato "+super.getBase();
	}
}
