package oopGeometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//chiediamo le misure
		System.out.println("Base rettangolo: ");
		int baseUtente = input.nextInt();
		System.out.println("Altezza rettangolo: ");
		int altezzaUtente = input.nextInt();
		
		Rettangolo rettUtente = new Rettangolo(baseUtente, altezzaUtente);
		
		System.out.println("Area rettangolo: " + rettUtente.calcolaArea());
		System.out.println("Perimetro rettangolo: " + rettUtente.calcolaPerimetro());

	}
}
