package daw1t.tarea8a;
import java.util.Scanner;
public class Ej8a_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rangoMenor=0;
		int rangoMayor=0;
		int num=0;
		boolean check = false;
		
		System.out.println("Establezca el valor mínimo del rango:");
		rangoMenor=sc.nextInt();
		System.out.println("Establezca el valor mayor del rango:");
		rangoMayor=sc.nextInt();
		
		System.out.println("Introduzca un número dentro del rango: ");
		do {
			num=sc.nextInt();
			if(num < rangoMenor || num > rangoMayor) {
				System.out.println("El número está fuera del rango entre "+rangoMenor+" y "+rangoMayor+". Escríbalo de nuevo.");
			} else {
				System.out.println("Has establecido un número válido. Enhorabuena.");
				check = true;
			}
		} while(check == false);
	}
}
