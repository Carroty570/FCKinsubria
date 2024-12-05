package FCKinsubria.Teoria.ex;

public class Gamma {

	public static void main(String[] args) throws Eccezione0 {
		
		Alfa a = new Alfa(); //y=6, x=0
		a.inc(); //x=1
		System.out.println(a.getTotale()); //7
		a = new Beta(); //w=7, x=0, y=7
		a.inc(); //w=8, x=1
		System.out.println(a.getTotale()); //16
		Beta b = new Beta(); //x=0, y=8, w=7
		b.inc(); //x=1, w=8
		System.out.println(b.getTotale()); //17
		System.out.println(a.getTotale()); //17
	}

}
