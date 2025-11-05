package ud2.ejemplos;

public class Ejemplo_4 {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		try {
			c=a/b;
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		} catch (Exception e) {
			System.out.println("Error desconocido.");
		} finally {
			System.out.println("Acciones finales.");
		} 
		
		System.out.println("Llega aquí?");
	}
}
