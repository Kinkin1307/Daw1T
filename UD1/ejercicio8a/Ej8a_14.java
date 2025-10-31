package daw1t.ejercicio8a;
import java.util.Scanner;
public class Ej8a_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("Por favor, escriba un número para dibujar un triángulo rectángulo con ese número de elementos de lado.");
		num=sc.nextInt();
		
		for (int i=0;i<num;i++) {
            for (int j=i;j<num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

		
	}
}
