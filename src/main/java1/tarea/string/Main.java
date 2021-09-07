package tarea.string;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada = new Scanner (System.in);
		
		int opcion = 0;
		do {
			System.out.println("******************************************\r\n"
					+ "\r\n"
					+ "1.     Ingresar Estudiante\r\n"
					+ "\r\n"
					+ "2.     Buscar Estudiante\r\n"
					+ "\r\n"
					+ "3.     SALIR\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "******************************************");
			opcion = Entrada.nextInt();
				
			if(opcion == 1) {
				System.out.println("Ingrese datos del estudiante a guardar");	
					
				System.out.println("Ingrese el numero de cedula del estudiante 1: ");
			    String cedula0 = Entrada.nextLine();
			    System.out.println("Ingrese el numero de cedula del estudiante 2: ");
			    String cedula1 = Entrada.nextLine();
			    System.out.println("Ingrese el numero de cedula del estudiante 3: ");
			    String cedula2 = Entrada.nextLine();
			    System.out.println("Ingrese el numero de cedula del estudiante 4: ");
			    String cedula3 = Entrada.nextLine();
			    System.out.println("Ingrese el numero de cedula del estudiante 5: ");
			    String cedula4 = Entrada.nextLine();
			    
			    Estudiante  e1 = new Estudiante();
			    e1.setCedula(cedula0);
			    Estudiante  e2 = new Estudiante();
			    e2.setCedula(cedula1);
			    Estudiante  e3 = new Estudiante();
			    e3.setCedula(cedula2);
			    Estudiante  e4 = new Estudiante();
			    e4.setCedula(cedula3);
			    Estudiante  e5 = new Estudiante();
			    e5.setCedula(cedula4);
			    
				Estudiante  estudiante []=new Estudiante [5];
			    estudiante[0] = cedula0;
			    estudiante[1] = cedula1;
			    estudiante[2] = cedula2;
			    estudiante[3] = cedula3;
			    estudiante[4] = cedula4;
				} else if  (opcion== 2) {
			
				System.out.println("Ingrese la cedula del estudiante a buscar : ");
					System.out.println("Ingrese el numero de cedula del estudiante a buscar: ");
				String cedula=Entrada.nextLine();
				
				boolean resultado = estudiante[0].equals(cedula);
				if(resultado==true) {
					System.out.println("El estudiante se encuentra registrado"+resultado);
				}
				resultado = estudiante[1].equals(cedula);
				if(resultado==true) {
					System.out.println("El estudiante se encuentra registrado"+resultado);
				}
				resultado = estudiante[2].equals(cedula);if(resultado==true) {
					System.out.println("El estudiante se encuentra registrado"+resultado);
				}
				resultado = estudiante[3].equals(cedula);
				if(resultado==true) {
					System.out.println("El estudiante se encuentra registrado"+resultado);
				}
				resultado = estudiante[4].equals(cedula);
				if(resultado==true) {
					System.out.println("El estudiante se encuentra registrado"+resultado);
				}		
			}
		} while (opcion !=3);
	}
}