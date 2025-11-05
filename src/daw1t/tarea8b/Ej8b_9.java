package daw1t.tarea8b;
import java.util.Scanner;
public class Ej8b_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura=0;
		
		
		System.out.println("Indicame la altura de la L: ");
		altura=sc.nextInt();
		int horizontal=(altura/2)+1;
		
		for (int i = 0; i < altura; i++) {
            if (i < altura - 1) {
                System.out.println("*");
            } else {
                for (int j = 0; j < horizontal; j++) {
                    System.out.print("*");
                }
            }
		}
	}
}