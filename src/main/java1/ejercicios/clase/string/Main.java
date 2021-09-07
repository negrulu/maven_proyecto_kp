package ejercicios.clase.string;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. contains
		Scanner entrada = new Scanner(System.in);
		
		int numero = 4;
		String frase = "El que madruga Dios le ayuda";
		
		System.out.println("Ingrese una palabra: ");
		String palabra = entrada.nextLine();
		
		boolean resultado = frase.contains("Dios");
		System.out.println("Contiene la palabra: "+resultado);
		
		//2. equals
		System.out.println("*********************************");
		String cadena1="Kevin";
		System.out.println("Ingrese la segunda cadena a comparar: ");
		String cadena2=entrada.nextLine();
		boolean resultado2=cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: "+resultado2);
		
		//3. y 4. upper y lower
		System.out.println("*********************************");
		String nombre = "Juan";
		String nombreEnMayuscula=nombre.toUpperCase();
		System.out.println("Nombre en mayuscula es: "+nombreEnMayuscula);
		
		String nombre2="JOSE";
		String nombreEnMinuscula=nombre.toLowerCase();
		System.out.println("Nombre en minuscula es: "+nombreEnMinuscula);
	}
}