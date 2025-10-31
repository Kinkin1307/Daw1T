package daw1t.ejercicio4;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Ej4_5 {
	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("La hora actual del ordenador es: "+hora.format(formato));
		//no he entendido muy la finalidad de este apartado, he tenido que buscar en documentación como hacer este ejercicio. ¿Será ese el objetivo?
	}
}
