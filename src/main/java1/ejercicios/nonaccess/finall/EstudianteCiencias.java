package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante{
	private String velocidadInternet;
	
	public final String horarioEntrada = "08:00";
	public String ciudadNacimiento="Quito";
	
	public EstudianteCiencias() {
		//No se puede reasignar a horarioEntrada por ser final
		horarioEntrada="8:30";
		ciudadNacimiento="Guayaquil";
	}
}
