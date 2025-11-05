package daw1t.tarea5a;
import java.util.Scanner;


public class Tarea5_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double gravedad = 9.8;
		double tiempo = 0;
		double velocidad=0;
		velocidad(gravedad, tiempo, velocidad, sc);
		
	}
	private static void velocidad(double gravedadC, double tiempoC, double velocidadC, Scanner sc) {
		System.out.println("Introduzca el valor de tiempo, teniendo en cuenta que la gravedad es de 9,8:");
		tiempoC=sc.nextDouble();
		while(tiempoC <=0) {
				System.out.println("El tiempo que ha introducido es incorrecto. Vuelva a intentarlo: ");
				tiempoC=sc.nextDouble();
		}
		velocidadC = gravedadC * tiempoC;
		
		System.out.println("La velocidad es de: "+velocidadC+" m/s");
		
	}
}
