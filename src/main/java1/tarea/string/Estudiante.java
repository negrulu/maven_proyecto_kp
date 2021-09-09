package tarea.string;

public class Estudiante {
	private String cedulaEstudiante;
	private String nombre;
	private String apellido;
	
	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}
	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Estudiante [cedulaEstudiante=" + cedulaEstudiante + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}
}