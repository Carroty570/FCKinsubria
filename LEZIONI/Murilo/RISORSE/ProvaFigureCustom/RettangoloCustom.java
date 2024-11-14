package Murilo.RISORSE.ProvaFigureCustom;

public class RettangoloCustom extends FiguraCustom {

	//CAMPI
	private double base;
	private double altezza;
	
	//COSTRUTTORI
	/*public RettangoloCustom(double b, double a) {
		base = b;
		altezza = a;
	}*/
	
	public RettangoloCustom(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	//METODI
	public double getBase() {
		return base;
	}

	public double getAltezza() {
		return altezza;
	}
	
	public double getArea() {
		return base*altezza;
	}
	
	public double getPerimetro() {
		return 2*(base+altezza);
	}
	
	public boolean equals(RettangoloCustom altro) {
		return this.base==altro.base && this.altezza==altro.altezza;
		//return this.getBase()==altro.getBase() && this.getAltezza()==altro.getAltezza();
	}
	
	@Override
	public boolean equals(Object altro) {
		if(altro instanceof RettangoloCustom)
			return this.equals((RettangoloCustom)altro);
		return false;
	}
	
	@Override
	public String toString() {
		return "Rettangolo con base "+base+" e altezza "+altezza;
	}
}
