package ejercicios.nonaccess.finall;

public class EstudianteMedicina extends Estudiante{
	
	private String codigoMSP;
	
	protected final void realizarPracticas() {
		System.out.println("Realizar 50 horas de practica");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 100 horas de pasantias");
	}
}
