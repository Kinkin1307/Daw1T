package daw1t.ejercicio4;
import java.util.Scanner;

public class Ej4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num=0;
		
		System.out.println("Indique un número decimal: ");
		num=sc.nextDouble();
		
		System.out.println("Redondeando pasa a ser: "+Math.round(num));
		
		
	}
}
