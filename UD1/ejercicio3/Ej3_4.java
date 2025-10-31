package daw1t.ejercicio3;
import java.util.Scanner;

public class Ej3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float longitud=0;
		final int kilometro=1609;
		float resultado=0;
		calculo(longitud, kilometro, resultado, sc);
		
	}
	private static void calculo(float longitudC, float kilometroC, float resultadoC, Scanner sc) {
		System.out.println("Por favor, introduzca una longitud en millas para su cálculo a kilómetros:");
		longitudC=sc.nextFloat();
		
		resultadoC = (float) longitudC * kilometroC;
		System.out.println(+longitudC+" son: "+resultadoC+" kilómetros");
		
		
	}
}
