package pruebas;
import java.util.Scanner;


public class tarea8bej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
		//El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad 
		//(división entera entre 2) de la altura más uno.
		
		int altura=0;
		
		
		System.out.println("Por favor, introduzca la altura de la L en números entero:");
		altura = sc.nextInt();
		int horizontal = ((altura / 2)+1); //establecemos la longitud horizontal
		
		for(int i = 0; i < altura; i++) { //bucle para imprimir la altura en asteriscos
			System.out.println("*");
		}
		for(int j = 0; j < horizontal ; j++) { //bucle para imprimir la longitud en asteriscos
			System.out.print("*");
		}
		
	}
}
