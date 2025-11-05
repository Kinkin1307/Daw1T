package daw1t.tarea8a;
import java.util.Scanner;
public class Ej8a_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar. 
		//El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.
		int num=0;
		boolean check = false;
		int tabla=0;
		int calculo=0;
		
		System.out.println("Introduzca un número dentro del rango entre 1 y 10: ");
		do {
			num=sc.nextInt();
			if(num < 1 || num > 10) {
				System.out.println("El número está fuera del rango. Escríbalo de nuevo.");
			} else {
				for(int i=0; i<10;i++) {
					tabla++;
					calculo=num*tabla;
					System.out.println(+num+"x"+tabla+" es igual a "+calculo);
				}
				check = true;
			}
		} while(check == false);
	}
}
