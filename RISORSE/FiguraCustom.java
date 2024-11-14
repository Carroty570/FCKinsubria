package RISORSE;

public abstract class FiguraCustom {

	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public boolean haAreaMaggiore(FiguraCustom altra) {
		return this.getArea() > altra.getArea();
	}
	
	public boolean haPerimetroMaggiore(FiguraCustom altra) {
		return this.getPerimetro() > altra.getPerimetro();
	}
}
