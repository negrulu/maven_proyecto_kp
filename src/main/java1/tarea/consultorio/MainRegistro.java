package tarea.consultorio;
import java.util.Scanner;

public class MainRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int opcion;
		Paciente paciente[] = new Paciente[4];
		
		Paciente paciente1 = new Paciente();
		String datos;

	do {	
		System.out.println("**********************");
		System.out.println("1. Registra paciente");
		System.out.println("2. Imprimir reporte");
		System.out.println("3. SALIR");
		System.out.println("**********************");
		opcion = entrada.nextInt();
		
		if (opcion==1) {
			for (int i=0; i<5 ;i++ ) {
			System.out.println("Ingrese el nombre del paciente");
		    String nombreIngresado = entrada2.nextLine();
		    Paciente nombre = paciente[i];
		    paciente1.setNombre(nombreIngresado);
		    
			System.out.println("Ingrese el apellido del paciente");
			String apellidoIngresado = entrada2.nextLine();
			Paciente apellido = paciente[i];
			paciente1.setApellido(apellidoIngresado);
			
			System.out.println("Ingrese la edad del paciente");
			int edadIngresada = entrada2.nextInt();
			Paciente edad = paciente[i];
			paciente1.setEdad(edadIngresada);
			    
			System.out.println("Ingrese el sintoma del paciente");
			String sintomaIngresado = entrada2.nextLine();
			Paciente sintoma = paciente[i];
			paciente1.setSintoma(sintomaIngresado);
		
			}
			System.out.println("**********************");
			System.out.println("1. Registra paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. SALIR");
			System.out.println("**********************");
			opcion = entrada.nextInt();
			}
		
		else if (opcion==2){
			
		}
	
	}
	while (opcion==3);	
	opcion = entrada.nextInt();
	}
}
