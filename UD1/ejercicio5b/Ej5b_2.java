package daw1t.ejercicio5b;
import java.util.Scanner;
public class Ej5b_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora=0;
		
		System.out.println("Por favor, escriba la hora en la que se encuentre actualmente:");
		hora=sc.nextInt();
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		} else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}
	}
}
