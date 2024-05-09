package oopGeometria;

public class Rettangolo {
	private int base;
	private int altezza;
	// incapsulo area e perimetro gia' calcolati e li richiamo col get
	private int area = base * altezza;
	private int perimetro = (base + altezza) * 2;
	
	public Rettangolo(int b, int h) {
	this.base = b;
	this.altezza = h;
	}
	//get area
	public int getArea() {
		return area;
	}
	//get perimetro
	public int getPerimetro() {
		return perimetro;
	}
	//set base
	public void setBase(int base) {
		this.base = base;
	}
	//set altezza
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
}
