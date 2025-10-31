package daw1t.ejercicio5b;
import java.util.Scanner;

public class Ej5b_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;
		boolean diaValido;

		do {
		    System.out.println("Escribe un día de la semana para comprobar que asignatura tienes a primera hora de ese día:");
		    dia = sc.next();
		    diaValido = true;

		    switch(dia) {
		        case "Lunes", "lunes":
		            System.out.println("Filosofía");
		            break;
		        case "Martes", "martes":
		            System.out.println("Matemáticas");
		            break;
		        case "Miercoles", "Miércoles", "miercoles", "miércoles":
		            System.out.println("Inglés");
		            break;
		        case "Jueves", "jueves":
		            System.out.println("Latín");
		            break;
		        case "Viernes", "viernes":
		            System.out.println("Lengua Castellana y Literatura");
		            break;
		        default:
		            System.out.println("Tu estás emmayao.");
		            diaValido = false;
		    }
		} while(!diaValido);
	}
}
