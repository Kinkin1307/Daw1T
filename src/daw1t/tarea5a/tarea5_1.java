package daw1t.tarea5a;

import java.util.Scanner;

public class tarea5_1 {
	public static void main(String[] args) {
		int num1=0;
		Scanner sc = new Scanner(System.in);
		estado(num1, sc);
		
	}
	private static void estado(int num1C, Scanner sc) {
		System.out.println("Por favor, introduzca un número entero");
		num1C = sc.nextInt();
		
		if(num1C > 0) {
			System.out.println("El número que ha introducido es positivo.");
		} else if(num1C == 0) {
			System.out.println("El número que ha introducido es 0. No es positivo ni negativo");
		} else {
			System.out.println("El número que has introducido es negativo");
		}
	}
}
