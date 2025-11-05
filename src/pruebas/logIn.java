package pruebas;
import java.util.Scanner;

public class logIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String secret = "Kinkin";
		String keyword="";
		String nombreUsuario="";
		int i=0;
		keypass(i, secret, keyword, nombreUsuario, sc);
		
	}
	private static void keypass(int i, String secretC, String keywordC, String nombreUsuarioC, Scanner sc) {
		System.out.println("Bienvenido al diario secreto de Francisco. Ingrese su nombre: ");
		nombreUsuarioC = sc.next();
		
		System.out.println("De acuerdo, "+nombreUsuarioC+", ahora introduce la contraseña secreta para acceder:");
		
		for(i=0;i<3;i++) {
			keywordC = sc.next();
			if(! keywordC.equals(secretC)) {
				System.out.println("La contraseña es incorrecta. Intentelo de nuevo.");
			} else if(keywordC.equals(secretC)) {
				System.out.println("Ha introducido correctamente la contraseña.");
				break;
			}
		}
	}
}