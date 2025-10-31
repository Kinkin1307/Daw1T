package daw1t.ejercicio8b;
import java.util.Scanner;
public class Ej8b_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura=0;
		String letra;
		
		System.out.println("Introduzca la altura de la pirámide a construir: ");
		altura=sc.nextInt();
		
		System.out.println("¿Con qué letra quiere mostrar la pirámide?");
		letra=sc.next();
		
		for(int i=0;i<altura;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(letra);
			}
			System.out.println();
		} 
		
	}
}
