package nominaEmpleados;

// Esta clase extiende a EmpleadoPorComision
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	
	private double salarioBase;
	
	public EmpleadoBaseMasComision (String nombre, String apellido, String nss, String fechaNac, double ventas, double tarifa, double salario){
		super (nombre, apellido, nss, fechaNac, ventas, tarifa);
		establecerSalarioBase(salario);
		// Valida y almacena el salario base
	}
	
	public void establecerSalarioBase (double salario){
		if (salario >= 0.0)
			salarioBase = salario;
		else
			throw new IllegalArgumentException("El salario base debe ser >= 0.0");
	}
	
	public double obtenerSalarioBase(){
		return salarioBase;
	}
	
	@Override
	public double obtenerMontoPago() {
		return obtenerSalarioBase() + super.obtenerMontoPago();
	}
	
	@Override
	public String toString(){
		return "con salario base:\n" + super.toString() + "\nsalario base:" + obtenerSalarioBase();
	}

}
