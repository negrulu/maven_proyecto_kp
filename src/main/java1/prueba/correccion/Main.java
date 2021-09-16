package prueba.correccion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Lector = new Scanner (System.in);
		Scanner Lector1 = new Scanner (System.in);

		String claveIngresada;
		String opcionMenu;
		int saldoInicial = 2500;
		
		do {
		
		System.out.println("Ingrese clave: ");
		claveIngresada = Lector.nextLine();
		
		if (claveIngresada.equals("85DB")) {
			
			do {
			System.out.println("**************************");
			System.out.println("Banco Pichincha Elija una opcion: ");
			System.out.println("1. Consultar pagos");
			System.out.println("2. Realizar Transferencia");
			System.out.println("3. SALIR");
			System.out.println("**************************");
			opcionMenu = Lector.nextLine();
			// while (!opcionMenu.equals("1)|| opcionMenu.equlas("2"));
			
			if(opcionMenu.equals("1")) {
				System.out.println("No tiene ningun pago pendiente");
				
			}else if(opcionMenu.equals("2")) {
				System.out.println("Ingrese la cuenta de destino: ");
				String cuentaDestino = Lector.nextLine();
				System.out.println("Ingrese el monto a transferir: ");
				int montoTransferir = Lector1.nextInt();
				saldoInicial = saldoInicial-montoTransferir;
				System.out.println("Su nuevo salo es: " + saldoInicial);
			}
			
		
			}while(!opcionMenu.equals("3"));
			claveIngresada = "0";
		}else {
			
			System.out.println("La clave no es la correcta");
			
		}
		}while(!claveIngresada.equals("-1"));
		
		System.out.println("Gracias por preferirnos");
	}
}