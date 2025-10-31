package daw1t.ejercicio5b;
import java.util.Scanner;
public class Ej5b_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1=0;
		float num2=0;
		float ecuacion=0;
		
		System.out.println("Escribe el primer número de la ecuación de primer grado: ");
		num1=sc.nextFloat();
		System.out.println("Escribe el segundo número de la ecuación de primer grado: ");
		num2=sc.nextFloat();
		
		if(num1 != 0 && num2 != 0) {
			ecuacion=num2/num1;
			System.out.println("x = "+ecuacion);
		} else {
			System.out.println("Esta ecuación no se puede resolver o tiene infinitas soluciones.");
		}
	}
}
