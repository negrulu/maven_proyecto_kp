package tarea.string;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Teclado = new Scanner (System.in);
		
		int opcion = 0;
		do {
			System.out.println("**************************");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. SALIR");
			System.out.println("**************************");
			
			opcion = Teclado.nextInt();
			if(opcion == 1) {
				
				System.out.println("Ingrese el nro de cedula: ");
				String cedula = Teclado.nextLine();
				
				Estudiante  alumno []=new Estudiante [5];
							
				Estudiante estudiante1 = new Estudiante();
				estudiante1.setCedulaEstudiante(cedula);
				
				Estudiante estudiante2 = new Estudiante();
				estudiante2.setCedulaEstudiante(cedula);
				
				Estudiante estudiante3 = new Estudiante();
				estudiante3.setCedulaEstudiante(cedula);
				
				Estudiante estudiante4 = new Estudiante();
				estudiante4.setCedulaEstudiante(cedula);
				
				Estudiante estudiante5 = new Estudiante();
				estudiante5.setCedulaEstudiante(cedula);
				
				alumno[0] = estudiante1;
				alumno[1] = estudiante2;
				alumno[2] = estudiante3;
				alumno[3] = estudiante4;
				alumno[4] = estudiante5;
			
			} else if  (opcion== 2) {				
				System.out.println("Ingrese un numero de cedula: ");
				String cedulaIng = Teclado.next();
								
				for(int i=0; i<5; i++) {					
				Estudiante estudiante = alumno[i];
				String cedula1 = estudiante.getCedulaEstudiante();
				
				boolean resultado = cedulaIng.equals(cedula1); 	
				System.out.println("El estudiante se encuentra: " + resultado);
				
				}
			}
		} while (opcion !=3);	
	} 
}