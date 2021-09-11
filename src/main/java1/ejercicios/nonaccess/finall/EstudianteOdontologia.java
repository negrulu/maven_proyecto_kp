package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{
	
	//no se puede sobreescibir un metodo final de su clase padre
	@Override
	public void realizarPracticas() {
		System.out.println("Realizar 100 horas de practica");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 200 horas de pasantias");
	}
}
