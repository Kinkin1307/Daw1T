package daw1t.ejercicio5b;
import java.util.Scanner;
public class Ej5b_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horasTrabajo=0;
		final int ordinarias=12;
		final int extras=16;
		int montoTotal=0;
		
		System.out.println("Introduce el número de horas que trabajas. Ten en cuenta que: Menos o igual a 40h = 12 euros la hora. Más de 40h = 16 euros la hora.");
		horasTrabajo=sc.nextInt();
		
		if(horasTrabajo <=40) {
			montoTotal = horasTrabajo * ordinarias;
			System.out.println("Tu sueldo semanal es de: "+montoTotal);
		} else if(horasTrabajo > 40) {
			montoTotal = horasTrabajo * extras;
			System.out.println("Tu sueldo semanal es de: "+montoTotal);
		}
	}
}
