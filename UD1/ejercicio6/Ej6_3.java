package daw1t.ejercicio6;
import java.util.Scanner;

public class Ej6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int par=0;
		int impar=0;
		System.out.println("Escribe un número entero");
		num=sc.nextInt();
		
		if(num %2 == 0) {
			par=1;
			System.out.println("Es par, el valor de la variable es:"+par);
		} else if(num %2 != 0) {
			impar=0;
			System.out.println("Es impar, el valor de la variable es: "+impar);
		}
	}
}