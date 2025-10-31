package daw1t.ejercicio7;
import java.util.Scanner;
public class Ej7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad=0;
		int nivelEstudios=0;
		int ingresos=0;
		boolean jasp;
		
		System.out.println("Introduce tu edad: ");
		edad=sc.nextInt();
		System.out.println("Ingresa tu nivel de estudios: ");
		nivelEstudios=sc.nextInt();
		System.out.println("Ingresa tu ingreso anual: ");
		ingresos=sc.nextInt();
		
		jasp = edad <= 28 && nivelEstudios > 3 && ingresos > 28000;
		
		System.out.println("Jasp es: "+jasp);
	}
}
