package daw1t.tarea2;

import java.util.Scanner;

public class Ej2_4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final int metroEquivalencia = 1609;
int conversor = 0;

	
	
	System.out.println("Por favor, escriba un número determinado de millas: ");
	int millas = sc.nextInt();
	
	conversor = millas * metroEquivalencia;
	
	System.out.println("De acuerdo, la equivalencia en metros de "+millas+" millas es de: "+conversor+" metros");
	
}
}
