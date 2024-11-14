package Matteo.RISORSE.ProvaFigureCustom;

public class QuadratoCustom extends RettangoloCustom {
	
	//COSTRUTTORI
	public QuadratoCustom(double lato) {
		super(lato, lato); //per forza la prima istruzione del costruttore
	}
	
	//METODI
	public double getLato() {
		return super.getBase();
	}

	public String getDescrizione1() {

		return this.toString();

	}

	public String getDescrizione2() {

		return super.toString();

	}
	
	@Override
	public String toString() {
		return "Quadrato con lato "+super.getBase();
	}
}
