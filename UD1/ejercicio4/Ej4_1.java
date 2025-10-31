package daw1t.ejercicio4;
import java.util.Scanner;


public class Ej4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Un valor de tipo float tiene límites establecidos y no puede salir de ese rango.");
		System.out.println("Pulse 1 para conocer el límite menor de una variable tipo short.");
		System.out.println("Pulse 2 para conocer el límite máximo de una variable tipo short.");
		System.out.println("Pulse 3 para conocer lo que sucede si establecemos un valor por encima o por debajo del rango máximo.");
		int opcion=sc.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("El límite menor es -32768");
				break;
				
			case 2:
				System.out.println("El límite mayor es 32767");
				break;
				
			case 3:
				short prueba=0;
				System.out.println("Escribe un número por encima de 32767:");
				prueba=sc.nextShort();
				System.out.println(prueba);
				
				break;
		}
	}
}