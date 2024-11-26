package Matteo.LezioneConstrutori;

import prog.utili.Frazione;

public class Lezionne1411 {
    
    
        
      //CAMPI
	private int num;
	private int den;
	
	//COSTRUTTORI
	
	public Lezionne1411(int num, int den){
		//memorizza il segno
		boolean negativo = (num < 0 && den > 0) || (num > 0 && den < 0);
		if(num < 0)
			num = -num; //elimina l'eventuale segno meno davanti a x
		if(den < 0)
			den = -den; //elimina l'eventuale segno meno davanti a y
		int m = mcd(num, den);
		if(negativo)
			this.num = -num/m; //il segno viene memorizzato al numeratore
		else
			this.num = num/m;
		this.den = den/m;
	}
	
	/*public Lezionne1411(int num){
		this.num = num;
		this.den = 1;
	}*/
	
	public Lezionne1411(int num){
		this(num, 1); //per forza la prima istruzione del costruttore
	}
	
	//METODI
	public int getNumeratore() {
		return num;
	}
	
	public int getDenominatore() {
		return den;
	}
		
	public Lezionne1411 per(Lezionne1411 altra) {
		int n = this.num*altra.num;
		int d = this.den*altra.den;
		Lezionne1411 ris = new Lezionne1411(n, d);
		return ris;
		//return new Lezionne1411(n, d);
	}
	
	public Lezionne1411 piu(Lezionne1411 f) {
		int n = this.num * f.den + this.den * f.num;
		int d = this.den * f.den;
		return new Lezionne1411(n, d);
	}
	
	public Lezionne1411 meno(Lezionne1411 f) {
		int n = this.num * f.den - this.den * f.num;
		int d = this.den * f.den;
		return new Lezionne1411(n, d);
	}
	
	public Lezionne1411 diviso(Lezionne1411 f) {
		int n = this.num * f.den;
		int d = this.den * f.num;
		return new Lezionne1411(n, d);
	}
	
	public boolean isMinore(Lezionne1411 f) {
		Lezionne1411 g = this.meno(f);
		return g.num < 0;
		//return (g.num < 0 && g.den > 0) || (g.num > 0 && g.den < 0);
	}
	
	public boolean isMaggiore(Lezionne1411 f) {
		Lezionne1411 g = this.meno(f);
		return g.num > 0;
		//return (g.num < 0 && g.den < 0) || (g.num > 0 && g.den > 0);
	}
	
	public boolean equals(Lezionne1411 f) {
		//Lezionne1411 g = this.meno(f);
		/*if (g.num == 0)
			return true;
		else
			return false;*/
		//return g.num == 0;
		return this.num == f.num && this.den == f.den;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Lezionne1411)
			return this.equals((Lezionne1411)o);
		return false;
	}
	
	@Override
	public String toString() {
		return "Frazione: "+num+"/"+den;
	}
	
	//METODI PRIVATI
	private int mcd(int a, int b) {
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}






    }




