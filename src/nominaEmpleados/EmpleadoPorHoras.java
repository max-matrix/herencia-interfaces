package nominaEmpleados;

public class EmpleadoPorHoras extends Empleado {
	
	private double sueldo;
	private double horas;
	
	public EmpleadoPorHoras(String nombre, String apellido, String nss, String fechaNac, double sueldoPorHoras, double horasTrabajadas){
		super(nombre, apellido, nss, fechaNac);
		establecerSueldo(sueldoPorHoras);
		establecerHoras(horasTrabajadas);
}
	
	public void establecerSueldo(double sueldoPorHoras){
		if (sueldoPorHoras >= 0.0)
			sueldo = sueldoPorHoras;
		else
			throw new IllegalArgumentException("El sueldo por hora debe ser >= 0.0");
	}	
	
	public void establecerHoras (double horasTrabajadas){
		if((horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0))
			horas = horasTrabajadas;
		else
			throw new IllegalArgumentException ("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
	}
	
	public double obtenerSueldo(){
		return sueldo;
	}
	
	public double obtenerHoras(){
		return horas;
	}
	
	@Override	
	public double obtenerMontoPago(){
		if (obtenerHoras() <= 40)
			return obtenerSueldo() * obtenerHoras();
		else
			return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
	}

	@Override
	public String toString(){
		return "-->Empleado por horas:\n" + super.toString() + "\nsueldo por hora:" + obtenerSueldo() + "\nhoras trabajadas:" + obtenerHoras(); 
	}
}
