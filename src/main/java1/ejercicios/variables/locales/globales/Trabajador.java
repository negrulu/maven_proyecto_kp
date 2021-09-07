package ejercicios.variables.locales.globales;

public class Trabajador {
	private String nombre;
	private int cedula;
	private int edad;
	//variables
	//en funcion de su alcance
	//locales: se declaran a nivel de metodos
	//globales: se declaran a nivel de clase
	
	
	
	//constructor
	//metodos
	public void trabajar() {
		this.nombre="Kevin";
		String trabajo = "Sellar documentos";
		trabajo="Elaborar documentos";
		trabajo="Convencer clientes";
	}
	public void casa() {
		//no me dejara usar esta variable en este constructor
		//por que trabajo es una variable local del metodo anterior
		trabajo="Hacer trabajo en casa";
	}
}
