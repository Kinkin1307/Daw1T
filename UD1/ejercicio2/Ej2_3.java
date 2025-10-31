package daw1t.tarea2;

import java.util.Scanner;

public class Ej2_3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Por favor, escriba el número que será dividido: ");
	int num1 = sc.nextInt();
	System.out.println("Por favor, escriba el segundo número entero que dividirá: ");
	int num2 = sc.nextInt();
	
	System.out.println("El resultado de dividir "+num1+" y "+num2+" es: "+(num1 / num2));
}
}
