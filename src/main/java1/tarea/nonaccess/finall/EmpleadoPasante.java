package tarea.nonaccess.finall;

public class EmpleadoPasante extends EmpleadoFinanzas{
	
	//no se puede sobreescibir un metodo final de su clase padre
	@Override
	protected final void revisarRegistros() {
		System.out.println("Revisar 100 registros de este mes");
	}
	
	protected void contestarTelefono() {
		System.out.println("Contestar el telefono de su cubiculo por 1 semana");
	}
}
