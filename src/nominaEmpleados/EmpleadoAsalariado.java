package nominaEmpleados;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String nss, String fechaNac, double salario) {
		super(primerNombre, apellidoPaterno, nss, fechaNac); // Los pasa al contructor de Empleado.
		establecerSalarioSemanal(salario); // Valida y almacena el salario. Invoco al m�todo.
		// Se hace as� porque adem�s de hacer la asignaci�n tiene que pasar por una validaci�n,
		// que est� implentada en establecerSalarioSemanal()
		// this.salarioSemanal = salarioSemanal;
	}

	// Establece el salario:
	public void establecerSalarioSemanal(double salario){
		if (salario >= 0.0)
			salarioSemanal = salario;
		else
			throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
		// Las exceptions son el manejo de errores en JAVA.
	}
	
	public double obtenerSalarioSemanal(){
		return salarioSemanal;
	}

	// Calcula los ingresos; sobrescribe el m�todo abstracto ingresos en Empleado:
	@Override
	/* Borramos este m�todo y ponemos la implementaci�n de la interfaz PorPagar:
	 public double obtenerMontoPago() {
		return obtenerSalarioSemanal();
	}
	*/
	public double obtenerMontoPago() {
		return obtenerSalarioSemanal();
	}

	// Devuelve representaci�n String de un objeto EmpleadoAsalariado:
	@Override
	public String toString() {
		return "--> Empleado asalariado:\n" + super.toString() + "\nSalario semanal: " + obtenerSalarioSemanal();
		// Invoco al toString de la clase padre y sumo el retorno del salario semanal.
	}
	
}
