package daw1t.tarea8b;
import java.util.Scanner;
public class Ej8b_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura=0;
		String letra;
		
		System.out.println("Introduzca la altura de la pirámide a construir: ");
		altura=sc.nextInt();
		
		System.out.println("¿Con qué letra quiere mostrar la pirámide?");
		letra=sc.next();
		
		 for (int i=1;i<=altura;i++) {
	            for (int j=1;j<=altura+i-1; j++) {
	                if(j>=altura-i+1) {
	                	 System.out.print(letra);
	                } else {
	                	System.out.print(" ");
	                }
	                    
	            }
	            System.out.println();
	        }

		
	}
}
