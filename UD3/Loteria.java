package dawt1ud3;
import java.util.Scanner;


//Excepción propia
class GordoException extends Exception {
	//COMPLETAR
	public GordoException(String mensaje) {
		super(mensaje);
	}
}

public class Loteria {	
	
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
	    int[] bombo = new int[numBolas];
	    for (int i = 0; i < numBolas; i++) {
	        bombo[i] = i;
	    }
	    
	    return bombo;
	}
	
	//devuelve un array de tamaño numPremios con todos los premios del sorteo
	public static String[] creaBomboPremios(int numPremios) {
		String[] bomboPremios = new String[numPremios];
		
		bomboPremios[0]="PRIMER PREMIO";  // gordo de navidad
		bomboPremios[1]="SEGUNDO PREMIO";	// un segundo premio
		
		//COMPLETAR
		
		// un tercer premio
		bomboPremios[3]="TERCER PREMIO";
		// dos cuartos premios
		bomboPremios[4]="CUARTO PREMIO";
		bomboPremios[5]="CUARTO PREMIO";

		// 8 quintos premios
		for(int i=6;i<14;i++) {
			bomboPremios[i]="QUINTO PREMIO";
		}

		// el resto hasta completar 1.807 premios son "pedrea"
		
		for(int j=15;j<numPremios;j++) {
			bomboPremios[j]="Pedrea...";
		}
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		int numAgraciado = (int) (Math.random()*bombo.length);
		boolean repetido = true;
		
		
		
		while(repetido){
			if(bombo[numAgraciado]== -1) { //si el número ya ha salido, volvemos a randomizarlo
				numAgraciado = (int) (Math.random()*bombo.length);
			} else {
				repetido = false;
				numAgraciado = bombo[numAgraciado];
			}
		}	
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		bombo[numAgraciado]=-1;
		
		return numAgraciado;
	}
	
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		int indicePremiado = (int) (Math.random()*bombo.length);
		String premio = "";
		boolean repetido = true;
		
		while(repetido && bombo[indicePremiado] != null) {
			if(bombo[indicePremiado].equals("X")) {
				indicePremiado = (int) (Math.random()*bombo.length);
			} else {
				repetido = false;
				premio = bombo[indicePremiado];
			}
		}
		// si el premio ya había salido, generamos otro al azar
		//COMPLETAR
		
		// marcamos el premio que ha salido
		
		//COMPLETAR
		
		bombo[indicePremiado] = "X";
				
		return premio;
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
			
		//COMPLETAR
		
		for(int i=0;i<numerosSorteo.length;i++) {
			if(numerosSorteo[i].equals(miDecimo)) {
				premio = premiosSorteo[i];
				break;
			}
		}
		return premio;
	}
	
	
	//Implementa un bucle para comprobar, haciendo uso del método heSidoAgraciado, si nuestro décimo tiene o no premio
	// Debe comprobar que se introducen exactamente 5 dígitos entre el 0 y el 9, por ejemplo 04544
	// Al introducir fin, finaliza la comprobación de décimos
	public static void compruebaDecimos(String[] numerosSorteo, String[] premiosSorteo) throws GordoException{
		Scanner sc=new Scanner(System.in);	
		String miDecimo;
		String miPremio="";
		boolean terminarDeComprobar=false;
		boolean numeroValido=false;
		
		System.out.println("\nCOMPROBACION DE DECIMOS:");
		
		//Compruebo si me ha tocado la lotería
		
		while(true) {
            System.out.println("Introduzca los 5 dígitos de su décimo (fin para terminar)");
            miDecimo = sc.next();
           
            if (miDecimo.equals("fin")) {
                break;
            }
           
            if (miDecimo.length() != 5) {
                System.out.println("Debe introducir fin o un número de 5 cifras.");
                miDecimo = sc.next();
            }

            miPremio = heSidoAgraciado(numerosSorteo, premiosSorteo, miDecimo);
            
            if (miPremio.equals("Número no premiado")) {
                System.out.println("Número no premiado");
            } else {
                System.out.println("Agraciado con: " + miPremio);
                

                if (miPremio.equals("PRIMER PREMIO")) {
                    throw new GordoException("¡¡A celebrar, te ha tocado el Gordo!!");
                }
            }
		}
		
		//COMPLETAR
		
	}
				

	public static void main(String[] args) {
		
		final int MAX_NUMEROS=100000; // números del sorteo
		final int MAX_PREMIOS=1807;   // premios del sorteo
		
		int numeroAgraciado; //número que sale del bombo
		String premio=""; //premio que sale del bombo
		
				
		int[] bomboBolas = new int[MAX_NUMEROS];
		String[] bomboPremios = new String[MAX_PREMIOS];

		String[] listaNumerosSorteo = new String[MAX_PREMIOS]; // lista oficial de números que han salido en el sorteo
		String[] listaPremiosSorteo = new String[MAX_PREMIOS]; // lista oficial de premios que han salido en el sorteo
		
		try {
		
			//Creamos los bombos con sus bolas
			bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
			bomboPremios=creaBomboPremios(MAX_PREMIOS);
			
			//Mostramos el listado completo de números premiados
			System.out.println("\nLISTADO OFICIAL DE PREMIOS:\n");
		
			int j=0;
			for (int i=0;i<MAX_PREMIOS;i++) {
				//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
				numeroAgraciado=dameNumero(bomboBolas);
				String numeroFormateado=String.format("%05d",numeroAgraciado);
			
				//Sacamos un premio del bombo
				premio=damePremio(bomboPremios);
				
				//Añado el número a la lista oficial del sorteo en la posición j
				listaNumerosSorteo[j]=numeroFormateado;
				
				
				//Añado el premio a la lista oficial del sorteo en la posición j
				listaPremiosSorteo[j] = premio;
				//COMPLETAR
				
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		}
		
		catch (GordoException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
				System.out.println("Error:"+e.getMessage());
				} finally {
					System.out.println("\nSorteo finalizado");			
				}		
	}
}