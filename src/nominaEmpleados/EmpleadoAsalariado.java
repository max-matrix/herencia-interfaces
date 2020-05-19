package nominaEmpleados;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String nss, String fechaNac, double salario) {
		super(primerNombre, apellidoPaterno, nss, fechaNac); // Los pasa al contructor de Empleado.
		establecerSalarioSemanal(salario); // Valida y almacena el salario. Invoco al método.
		// Se hace así porque además de hacer la asignación tiene que pasar por una validación,
		// que está implentada en establecerSalarioSemanal()
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

	// Calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado:
	@Override
	/* Borramos este método y ponemos la implementación de la interfaz PorPagar:
	 public double obtenerMontoPago() {
		return obtenerSalarioSemanal();
	}
	*/
	public double obtenerMontoPago() {
		return obtenerSalarioSemanal();
	}

	// Devuelve representación String de un objeto EmpleadoAsalariado:
	@Override
	public String toString() {
		return "--> Empleado asalariado:\n" + super.toString() + "\nSalario semanal: " + obtenerSalarioSemanal();
		// Invoco al toString de la clase padre y sumo el retorno del salario semanal.
	}
	
}
