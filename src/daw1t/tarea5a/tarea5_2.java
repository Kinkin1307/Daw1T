package daw1t.tarea5a;

import java.util.Scanner;

public class tarea5_2 {
	public static void main(String[] args) {
		int num1=0;
		Scanner sc = new Scanner(System.in);
		numero(num1, sc);
	}
	private static void numero(int num1C, Scanner sc) {
		System.out.println("Introduzca el número 12, por favor para acceder.");
		num1C = sc.nextInt();
		
		while(num1C != 12) {
			System.out.println("No has introducido el número 12, hazlo de nuevo");
			num1C = sc.nextInt();
		}
		System.out.println("Ha introducido correctamente el número, bienvenido.");
	}
}
