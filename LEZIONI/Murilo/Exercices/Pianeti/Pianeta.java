package Murilo.Exercices.Pianeti;


public enum Pianeta {
	
	MERCURIO, VENERE, TERRA, MARTE, GIOVE, SATURNO, URANO, NETTUNO;
	
	/* calcolare il pianeta successivo nel sistema solare */
	public Pianeta successivo(){
		switch(this) {
			case MERCURIO: return VENERE;
			case VENERE: return TERRA;
			case TERRA: return MARTE;
			case MARTE: return GIOVE;
			case GIOVE: return SATURNO;
			case SATURNO: return URANO;
			case URANO: return NETTUNO;
			case NETTUNO: return null; //non ha un successivo
		}
		return null; //TMCH nessun case valido (non può succedere...)
	}
	
	public Pianeta successivo(int pos){
		Pianeta[] pianeti = values();
		if(pos >= pianeti.length-1)
			return null;
		//else 
			return pianeti[pos+1];
		//oppure (pos >= pianeti.length-1) ? return null : return pianeti[pos+1];
	}
	
	/* calcolare il pianeta precedente nel sistema solare */
	public Pianeta precedente(){
		switch(this) {
			case MERCURIO: return null; //non ha un precedente
			case VENERE: return MERCURIO;
			case TERRA: return VENERE;
			case MARTE: return TERRA;
			case GIOVE: return MARTE;
			case SATURNO: return GIOVE;
			case URANO: return SATURNO;
			case NETTUNO: return URANO;
		}
		return null; //TMCH nessun case valido (non può succedere...)
	}
	
	public Pianeta precedente(int pos){
		Pianeta[] pianeti = values();
		if(pos <= 0 || pos >= pianeti.length)
			return null;
		//else 
			return pianeti[pos-1];
	}
}