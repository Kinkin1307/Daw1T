package ud2.ejemplos;

public class ejemploExcepcion {
	public static void main(String[] args) {
		int num1=1;
		int num2=0;
		
		try {
			int resultado=num1/num2;
		} catch(ArithmeticException e) {
			System.out.println("Dónde vas, animal! Diviendo entre 0!");
			System.out.println(e.getMessage());
		}
		System.out.println("¿Llegas aquí?");
	}
}
