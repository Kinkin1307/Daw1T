package daw1t.ejercicio5b;
import java.util.Scanner;

public class Ej5b_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia=0;
		boolean numValido = true;
		
		    System.out.println("Escriba un numero del 1 al 7 para saber que dia de la semana es por correspondencia del numero: ");
		    dia = sc.nextInt();
		    switch(dia) {
		        case 1:
		            System.out.println("Lunes");
		            break;
		        case 2:
		            System.out.println("Martes");
		            break;
		        case 3:
		            System.out.println("Miercoles");
		            break;
		        case 4:
		            System.out.println("Jueves");
		            break;
		        case 5:
		            System.out.println("Viernes");
		            break;
		        case 6:
		        	System.out.println("Sabado");
		        	break;
		        case 7:
		        	System.out.println("Domingo");
		        default:
		            System.out.println("No has introducido un numero correcto.");
		       
		            
		    }
	}
}