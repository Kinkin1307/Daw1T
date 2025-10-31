package daw1t.ejercicio7;
import java.util.Scanner;
public class Ej7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int cambio1=0;
		int cambio2=0;
		
		System.out.println("Escribe el primer numero");
		num1=sc.nextInt();
		System.out.println("Escribe el segundo numero");
		num2=sc.nextInt();
		
		System.out.println("El primer valor es: "+num1);
		System.out.println("El segundo valor es: "+num2);
		
		cambio2=num1;
		cambio1=num2;
		
		num2=cambio2;
		num1=cambio1;
		
		System.out.println("Ahora "+cambio2+" es: "+num1);
		System.out.println("Ahora "+cambio1+" es: "+num2);
	}
}
