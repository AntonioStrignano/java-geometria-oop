package oopGeometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//chiedo base e altezza all'utente
		System.out.println("Base rettangolo: ");
		int baseUtente = (input.nextInt());
		System.out.println("Altezza rettangolo: ");
		int altezzaUtente = (input.nextInt());
		//inizializzo rettangolo
		Rettangolo rettUtente = new Rettangolo(baseUtente,altezzaUtente);
		
		System.out.println("Area rettangolo: " + rettUtente.getArea());
		System.out.println("Perimetro rettangolo: " + rettUtente.getPerimetro());
	}
}
