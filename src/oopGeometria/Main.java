package oopGeometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Rettangolo rettUtente = new Rettangolo();
		//chiediamo le misure
		System.out.println("Base rettangolo: ");
		rettUtente.setBase(input.nextInt());
		System.out.println("Altezza rettangolo: ");
		rettUtente.setAltezza(input.nextInt());
		
		System.out.println("Area rettangolo: " + rettUtente.calcolaArea());
		System.out.println("Perimetro rettangolo: " + rettUtente.calcolaPerimetro());

	}
}
