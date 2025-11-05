package PruebasPreExamen1UD1;
import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int capacidad=80;
		boolean llena=false;
		int sumaTotal=0;
		int acciones=0;
		int ingreso=0;
		int sustraccion=0;
		char eleccion;
		
		
		System.out.println("--- Cajero automatico ---");
		System.out.println("Ingrese o retire en el cajero..");
		System.out.println("¿Quieres ingresar (I) dinero o retirarlo (R)? (I/R)");
		eleccion=sc.nextLine().charAt(0);
		
		while(llena==false) {
			switch(eleccion) {
			case 'I':
				ingreso=sc.nextInt();
				
				if(ingreso <= 0) {
					System.out.println("No has introducido nada de dinero, pesetero");
					llena=false;
				} else if(ingreso > 0 && sumaTotal <= capacidad && ingreso <= capacidad) {
					sumaTotal+=ingreso;
					acciones++;
					System.out.println("Ha introducido "+ingreso+" euros. Tienes un total de "+sumaTotal+" euros en la cuenta.");
					System.out.println("Aportes hasta ahora: "+acciones);
					llena=false;
				} else if(ingreso > capacidad || sumaTotal > capacidad) {
					System.out.println("No cabe tanto dinero en el ojete del cerdito. Inténtalo otra vez");
				}
				break;
			case 'R':
				sustraccion=sc.nextInt();
				System.out.println("¿Cuánto deseas retirar?");
				
				if(sustraccion < capacidad) {
					sumaTotal-=sustraccion;
					acciones++;
					System.out.println("Ha retirado "+sustraccion+" euros. Tienes un total de "+sumaTotal+" euros en la cuenta.");
				}
				
				break;
			}	  
			if(sumaTotal == capacidad) {
			llena=true;
			} 
		}
		System.out.println("Cantidad de veces que has aportado dinero: "+acciones);
		System.out.println("Cantidad de dinero abonado: "+sumaTotal);
		System.out.println("");
	}
}
