package FCKinsubria.Teoria.ex;
public class Alfa {
	private int x;
	private static int y = 5;
	
	public Alfa() {
		y++;
	}
	
	public void inc() throws Eccezione0 {
		if(x > 5)
			throw new Eccezione0();
		x++;
	}
	
	public int getTotale() {
		return x+y;
	}
}
