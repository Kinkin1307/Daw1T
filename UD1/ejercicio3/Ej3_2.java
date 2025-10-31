package daw1t.ejercicio3;

import java.util.Scanner;

public class Ej3_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	short añoNacimiento = 0;
	short añoActual = 0;
	short edad = 0;
	calculo(añoNacimiento, añoActual, edad, sc); //llamamos al metodo con las variables necesarias para su ejecución con las variables inicializadas
}

private static void calculo(short añoNacimientoC, short añoActualC, short edadC, Scanner sc) {
	// metodo privado para realizar el cálculo
	while(añoNacimientoC < 1930 || añoActualC < 2025) {
		System.out.println("Introduzca su año de nacimiento:");
		añoNacimientoC = sc.nextShort();
		// pedimos que se inserten los datos y se guardan en variables tipo short
		if(añoNacimientoC < 1930) { //condicional para la excepción de ambos datos.
			System.out.println("Has introducido un dato/s inválidos. Por favor, vuelva a introducirlos.");
		} else {
			System.out.println("Introduzca el año actual: ");
			añoActualC = sc.nextShort();
		}
		
		if(añoActualC > 2025) {
			System.out.println("Tu eres betico y gitano marron.");
		} else {
			edadC=(short)(añoActualC - añoNacimientoC);
			System.out.println("La edad que usted tiene es de: "+edadC);

		}
	}
	
}
}
