package daw1t.ejercicio6;
import java.util.Scanner;
public class Ej6_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radio=0;
		int eleccion=0;
		float diametro=0;
		float perimetro=0;
		float area=0;
		double pi = 3.14;
		
		System.out.println("Establezca el valor del radio de una circunferencia:");
		radio=sc.nextFloat();
		
		System.out.println("Elija una de las 3 opciones siguientes");
		System.out.println("1: Calcular diámetro");
		System.out.println("2: Calcular perímetro");
		System.out.println("3: Calcular área");
		eleccion=sc.nextInt();
		
		switch(eleccion) {
		case 1:
			diametro=radio*2;
			System.out.println("El diametro es de: "+diametro);
			break;
		case 2:
			perimetro= 2* (float) pi *  radio;
			System.out.println("El perimetro es de: "+perimetro);
			break;
		case 3:
			area= (float) pi * (radio*2);
			System.out.println("El area es de: "+area);
		}
		
	}
}
