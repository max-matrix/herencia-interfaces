package nominaEmpleados;

public class EmpleadoPorPiezas extends Empleado{
	
	private double sueldo;
	private int piezas;
	
	public EmpleadoPorPiezas(String primerNombre, String apellidoPaterno, String nss, String fechaNac, double sueldo, int piezas) {
		super(primerNombre, apellidoPaterno, nss, fechaNac);
		establecerSueldo(sueldo);
		establecerPiezas(piezas);		
	}
	
	public void establecerSueldo(double salario){
		if (salario >= 0.0)
			sueldo = salario;
		else
			throw new IllegalArgumentException("El salario debe ser >= 0.0");
	}
	
	public double obtenerSueldo(){
		return sueldo;
	}
	
	public void establecerPiezas(int piezas){
		if (piezas >= 0)
			this.piezas = piezas;
		else
			throw new IllegalArgumentException("La cantidad de piezas deben ser >= 0");
	}
	
	public double obtenerPiezas(){
		return piezas;
	}
	
	@Override
	public double obtenerMontoPago() {
		return obtenerSueldo() * obtenerPiezas();
	}
	
	@Override
	public String toString() {
		return "--> Empleado por pieza:\n" + super.toString() + "\nsalario: " + obtenerSueldo();
	}
	
}
