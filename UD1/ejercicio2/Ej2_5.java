package daw1t.tarea2;

import java.util.Scanner;

public class Ej2_5 {
public static void main(String[] args) {
	int equivalenciaF = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor, introduzca una temperatura en grados centígrados: ");
	int tempC = sc.nextInt();
	
	equivalenciaF = 9 * tempC / 5 + + 32;
	
	System.out.println("De acuerdo. La equivalencia de "+tempC+" centígrados a grados Fahrenheit es de: "+equivalenciaF+" grados Fahrenheit.");
}
}
