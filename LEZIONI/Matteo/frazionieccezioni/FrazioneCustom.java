package Matteo.frazionieccezioni;

public class FrazioneCustom {

	//CAMPI
	private int num;
	private int den;
	public static int contaOggetti = 0;
	
	//COSTRUTTORI
	public FrazioneCustom(int num, int den) throws FrazioneException {
		if(den == 0)
			throw new FrazioneException("Frazione non valida: denominatore 0");
			//throw new ArithmeticException("Frazione non valida: denominatore 0");
		//memorizza il segno
		boolean negativo = (num < 0 && den > 0) || (num > 0 && den < 0);
		if(num < 0)
			num = -num; //elimina l'eventuale segno meno davanti a x
		if(den < 0)
			den = -den; //elimina l'eventuale segno meno davanti a y
		int m = FrazioneCustom.mcd(num, den);
		if(negativo)
			this.num = -num/m; //il segno viene memorizzato al numeratore
		else
			this.num = num/m;
		this.den = den/m;
		contaOggetti++;
	}
	
	/*public FrazioneCustom(int num){
		this.num = num;
		this.den = 1;
	}*/
	
	public FrazioneCustom(int num) throws FrazioneException {
		this(num, 1); //per forza la prima istruzione del costruttore
	}
	
	//METODI
	public int getNumeratore() {
		return num;
	}
	
	public int getDenominatore() {
		return den;
	}
		
	public FrazioneCustom per(FrazioneCustom altra) {
		int n = this.num*altra.num;
		int d = this.den*altra.den;
		try {
			return new FrazioneCustom(n, d);
		} catch (FrazioneException e) {
			return null; //TMCH
		}
		//return new FrazioneCustom(n, d);
	}
	
	public FrazioneCustom piu(FrazioneCustom f) {
		int n = this.num * f.den + this.den * f.num;
		int d = this.den * f.den;
		try {
			return new FrazioneCustom(n, d);
		} catch (FrazioneException e) {
			return null; //TMCH
		}
	}
	
	public FrazioneCustom meno(FrazioneCustom f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		try {
			return new FrazioneCustom(n, d);
		} catch (FrazioneException e) {
			return null; //TMCH
		}
	}
	
	public FrazioneCustom diviso(FrazioneCustom f) throws FrazioneException {
		int n = this.num * f.den;
		int d = this.den * f.num;
		return new FrazioneCustom(n, d);
	}
	
	public boolean isMinore(FrazioneCustom f) {
		FrazioneCustom g = this.meno(f);
		return g.num < 0;
		//return (g.num < 0 && g.den > 0) || (g.num > 0 && g.den < 0);
	}
	
	public boolean isMaggiore(FrazioneCustom f) {
		FrazioneCustom g = this.meno(f);
		return g.num > 0;
		//return (g.num < 0 && g.den < 0) || (g.num > 0 && g.den > 0);
	}
	
	public boolean equals(FrazioneCustom f) {
		//FrazioneCustom g = this.meno(f);
		/*if (g.num == 0)
			return true;
		else
			return false;*/
		//return g.num == 0;
		return this.num == f.num && this.den == f.den;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof FrazioneCustom)
			return this.equals((FrazioneCustom)o);
		return false;
	}
	
	@Override
	public String toString() {
		return "Frazione: "+num+"/"+den;
	}
	
	//METODI PRIVATI
	private static int mcd(int a, int b) {
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}
}
