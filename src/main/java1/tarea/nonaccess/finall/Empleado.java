package tarea.nonaccess.finall;

public final class Empleado extends DireccionGeneral{
	private String tipoTrabajo="Papeleo";
	private final String horarioEntrada = "07:30";
	
	public Empleado() {
		//horarioEntrada me da error por que no se puede reasignar
		horarioEntrada="8:30";
		
		tipoTrabajo="Documentar";
	}
}
