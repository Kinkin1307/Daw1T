package pruebas;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mes;
		
		System.out.println("Introduce el numero de mes en el que estamos");
		mes=sc.next();
		
		switch(mes) {
			case "Diciembre", "Enero", "Febrero":
				System.out.println("Es Invierno");
				break;
			
			case "Marzo", "Abril", "Mayo":
				System.out.println("Es Primavera");
				break;
			
			case "Junio", "Julio", "Agosto":
				System.out.println("Es Verano");
				break;
			
			case "Septiembre", "Octubre", "Noviembre":
				System.out.println("Es Otoño");
				break;
		
			default: 
				System.out.println("Di un mes malito de mierda");
		}
	}
}
