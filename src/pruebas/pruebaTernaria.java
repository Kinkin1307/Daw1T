package pruebas;

import java.util.Scanner;

public class pruebaTernaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// vamos a realizar un ejemplo de un operador ternario, es decir, 
		// que tenga tres condicionales que cumplirse
		
		boolean pasa=false;
		int edad=0;
		String ciudad = "Sevilla";
		acceso(pasa, edad, sc, ciudad);
		
	}
	private static void acceso(boolean pase, int edadC, Scanner sc, String ciudadC) {
		System.out.println("Introduzca su edad para acceder a la discoteca");
		edadC = sc.nextInt();
		System.out.println("¿De qué ciudad eres?");
		ciudadC = sc.next();
		
		pase=(edadC>=18 && ciudadC.equals("Sevilla"))?true:false;
		if(pase) {
			System.out.println("Usted puede pasar.");
		} else {
			System.out.println("Usted no puede pasar.");
		}
	}
}
