package daw1t.ejercicio3;

import java.util.Scanner;

public class Ej3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte num1=0;
		byte num2=0;
		byte resultado=0;
		calculo(num1,num2,resultado, sc);
		
	}
	
	private static void calculo(byte num1c, byte num2c,byte resultadoc, Scanner sc) {
		do {
			// metodo privado para calcular la suma de los dos números.
			
			System.out.println("Especifique el primer número a sumar de dos cifras: ");
			num1c = sc.nextByte();
			// usuario introduce los números y se guardan en una variable
			
			System.out.println("Especifique el segundo número a sumar de dos cifras: ");
			num2c = sc.nextByte();
			
			
			if(num1c < 10 || num2c < 10) {
				System.out.println("Los datos introducidos no son válidos. Por favor, introdúzcalos de nuevo.");
			} // excepción en caso de introducir datos inválidos. Si se cumple, vuelve a pedir los números.
			
			resultadoc = (byte) (num1c+num2c); // resultado de la suma en formato byte solicitado.
			
		} while(num1c < 10 || num2c < 10);
			System.out.println("El resultado de sumar "+num1c+" y "+num2c+" es: "+resultadoc);
			// cuando la condición "OR" se cumple, es decir, las variables están iniciadas, se hace el programa
			// una vez el usuario introduce valores por encima de 9, deja de cumplirse al entenderse por realizado el objetivo del método.
	}
}