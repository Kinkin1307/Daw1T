package daw1t.ejercicio8b;
import java.util.Scanner;

public class Ej8b_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura=0;
		int base=0;
		
		
		System.out.println("Indicame la altura de la U: ");
		altura=sc.nextInt();
		base=altura;
        for (int i = 0; i < altura; i++) {
            if (i < altura - 1) {
                System.out.print("*");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                System.out.print(" ");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

	}
}
