package daw1t.tarea5a;
import java.util.Scanner;

public class Tarea5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA=0;
		int numB=0;
		int numC=0;
		int mayor=0;
		
		comparador(numA, numB, numC, mayor, sc);
	}
	private static void comparador(int numAC, int numBC, int numCC, int mayorC, Scanner sc) {
		System.out.println("Introduzca el primer número:");
		numAC = sc.nextInt();
		
		System.out.println("Introduzca el segundo número:");
		numBC = sc.nextInt();
		
		System.out.println("Introduzca el tercer número:");
		numCC = sc.nextInt();
		
		if(numAC > numBC) {
			if(numAC > numCC) {
			}
			mayorC = numAC;
		}
		if(numBC > numAC) {
			if(numBC > numCC) {
			}
			mayorC = numBC;
		}
		if(numCC > numAC) {
			if(numCC > numCC) {
			}
			mayorC = numCC;
		}
		System.out.println("El número mayor de los tres es: "+mayorC);
	}
}
