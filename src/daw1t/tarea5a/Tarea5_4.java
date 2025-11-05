package daw1t.tarea5a;

import java.util.Scanner;

public class Tarea5_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		boolean i = true;
		paridad(num1, num2, sc, i);
		
		
	}
	private static void paridad(int num1C, int num2C, Scanner sc, boolean i) {
		
		do {
			System.out.println("Introduzca el primer número entero: ");
			num1C = sc.nextInt();
			
			System.out.println("Introduzca el segundo número entero: ");
			num2C = sc.nextInt();
			
			if(num1C % 2 == 0) {
				System.out.println("El número "+num1C+" es par");
			} else if(num1C % 2 != 0) {
				System.out.println("El número "+num1C+" es impar");
			}
			
			if(num2C % 2 == 0) {
				System.out.println("El número "+num2C+" es par");
			} else if(num1C % 2 != 0) {
				System.out.println("El número "+num2C+" es impar");
			}
			
			if(num1C == 13 || num2C == 69) {
				System.out.println("Usted es un guarrete.");
				i = false;
			}
			
		} while(i == true);
			
		
		
	}
}
