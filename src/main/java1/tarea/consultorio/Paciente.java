package tarea.consultorio;

public class Paciente {
	public String nombre;
	public String apellido;
	public int edad;
	public String sintoma;

	//get y set
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public int compareTo(Paciente o) {
			if (this.edad > o.getEdad()) {
				return 1;
				} else if (this.edad == o.getEdad()) {
				return 0;
				} else {
				return -1;
			}
		}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sintoma=" + sintoma
				+ "]";
	}
}
