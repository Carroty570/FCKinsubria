package RISORSE;

public class ProvaFigureCustom {

	public static void main(String[] args) {
		
		RettangoloCustom r1 = new RettangoloCustom(2, 5);
		RettangoloCustom r2 = new RettangoloCustom(2, 5);
		
		System.out.println("r1 ha come base "+r1.getBase()+" e come "
				+ "altezza "+r1.getAltezza()+", area = "+r1.getArea()+
				", perimetro = "+r1.getPerimetro());
		
		System.out.println("r2 ha come base "+r2.getBase()+" e come "
				+ "altezza "+r2.getAltezza()+", area = "+r2.getArea()+
				", perimetro = "+r2.getPerimetro());
		
		System.out.println("r1 -> "+r1.toString());
		System.out.println("r2 -> "+r2.toString());
		
		QuadratoCustom q = new QuadratoCustom(2);
		
		System.out.println("q ha come base "+q.getBase()+" e come "
				+ "altezza "+q.getAltezza()+", area = "+q.getArea()+
				", perimetro = "+q.getPerimetro());
		
		System.out.println("q -> "+q.toString());
		
		System.out.println("Area r1 > area q ? "+r1.haAreaMaggiore(q));
		System.out.println("Perimetro r1 > perimetro q ? "+r1.haPerimetroMaggiore(q));
		
		System.out.println("r1.equals(r2) ? "+r1.equals(r2));
		Object r3 = new RettangoloCustom(2, 5);
		System.out.println("r1.equals(r3) ? "+r1.equals(r3));
		r3 = new RettangoloCustom(2, 2);
		System.out.println("q.equals(r3) ? "+q.equals(r3));
	}
}
