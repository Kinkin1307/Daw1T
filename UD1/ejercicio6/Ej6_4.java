package daw1t.ejercicio6;
import java.util.Scanner;
public class Ej6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte num1=0;
		byte num2=0;
		byte numMenor=0;
		
		System.out.println("Establezca el primer numero:");
		num1=sc.nextByte();
		System.out.println("Establezca el segundo numero:");
		num2=sc.nextByte();
		
		if(num1 > num2) {
			numMenor = num2;
			System.out.println("El número menor entre "+num1+" y "+num2+" es: "+numMenor);
		} else if (num2 > num1){
			numMenor = num1;
			System.out.println("El número menor entre "+num1+" y "+num2+" es: "+numMenor);
		} else if(num1 == num2){
			System.out.println("Ambos números son iguales");
		}
		
		
	}
}
