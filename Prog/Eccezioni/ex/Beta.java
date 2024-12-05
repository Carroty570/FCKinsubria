package FCKinsubria.Prog.Eccezioni.ex;

public class Beta extends Alfa {

	private int w = 7;
	
	public void inc() throws Eccezione0{
		super.inc();
		if (w < 0)
			throw new SottoEccezione1();
		else if(w > 10)
			throw new SottoEccezione2();
		w++;
	}
	
	public int getTotale() {
		return super.getTotale() + w;
	}
}
