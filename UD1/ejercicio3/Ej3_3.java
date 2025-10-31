package daw1t.ejercicio3;

import java.util.Scanner;

public class Ej3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		calculo(num1, num2, resultado, sc);
		
	}
	
	private static void calculo(double num1C, double num2C, double resultadoC, Scanner sc) {
		
		
		while(num1C < 9 || num2C < 9) {
			System.out.println("Por favor, introduzca el primer número a dividir: ");
			num1C = sc.nextDouble();
			if(num1C < 9) {
				System.out.println("Has introducido número/s inválido/s. Por favor, introdúzcalo/s de nuevo.");
			} else if(num1C > 9){
				System.out.println("Especifique el segundo número a dividir: ");
				num2C = sc.nextShort();
			}
						
			if(num2C <= 9) {
				System.out.println("Has introducido número/s inválido/s. Por favor, introdúzcalo/s de nuevo.");
				
			} else if(num2C > 9){
				resultadoC = (double) (num1C / num2C);
			}
		}
		System.out.println("El resultado de dividir "+num1C+" entre "+num2C+" es de: "+resultadoC);
	}
}
