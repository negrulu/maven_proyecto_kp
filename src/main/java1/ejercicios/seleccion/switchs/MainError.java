package ejercicios.seleccion.switchs;
import java.util.Scanner;

public class MainError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja Opcion: ");
			System.out.println("1. Realizar transferencia");
			System.out.println("2. Consultar pagos");
			System.out.println("3. Salir");
			opcion = entrada.next();

			// El switch hasta antes de la versi�n 1.7
			// solo funcinaba para byte, Short, char e int
			switch (opcion) {

			case "1":
				System.out.println("Ingrese n�mero de cuenta");
				System.out.println();
				break;
			case "2":
				System.out.println("No existen pagos");
				System.out.println();
				break;
			case "3":
				System.out.println("Cerrando sistema");
				System.out.println();
				break;
			default:
				System.out.println("No ha elegido ninguna opci�n");
				System.out.println();
				break;

			}

		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}

}
