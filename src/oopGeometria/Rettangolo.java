package oopGeometria;

public class Rettangolo {
	private int base;
	private int altezza;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return (base + altezza) * 2;
	}
}
