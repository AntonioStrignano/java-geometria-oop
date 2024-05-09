package oopGeometria;

public class Rettangolo {
	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return (base + altezza) * 2;
	}
}
