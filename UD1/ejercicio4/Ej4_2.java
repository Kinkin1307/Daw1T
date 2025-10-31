package daw1t.ejercicio4;
import java.util.Scanner;
public class Ej4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1=0;
		double nota2=0;
		double sumaNotas=0;
		int alumnos=0;
		double resultado=0;
		
		calculo(nota1, sumaNotas, nota2, alumnos, resultado, sc);	
		
	}
	private static void calculo(double nota1C, double sumaNotasC, double nota2C, int alumnosC, double resultadoC, Scanner sc) {
		System.out.println("Escribe la nota del primer alumno: ");
		nota1C=sc.nextDouble();
		alumnosC++;
		
		System.out.println("Escribe la nota del segundo alumno: ");
		nota2C=sc.nextDouble();
		alumnosC++;
		
		sumaNotasC= nota1C + nota2C;
		resultadoC=(double)sumaNotasC / alumnosC;
		
		System.out.println("El resultado de la media aritmética de la nota de los alumnos es de: "+resultadoC);
		
	}
}
