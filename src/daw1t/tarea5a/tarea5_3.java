package daw1t.tarea5a;

import java.util.Scanner;

public class tarea5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		paridad(num1, sc);
		
	}
	private static void paridad(int num1C, Scanner sc) {
		System.out.println("Por favor, introduzca un número: ");
		num1C = sc.nextInt();
		
		if(num1C % 2 == 0) {
			System.out.println("El número "+num1C+" es par.");
		} else {
			System.out.println("El número "+num1C+" es impar.");
		}
	}
}
