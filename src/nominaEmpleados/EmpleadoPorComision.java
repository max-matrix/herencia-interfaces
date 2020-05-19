package nominaEmpleados;

public class EmpleadoPorComision extends Empleado {
	
	private double ventasBrutas; // Ventas totales por semana
	private double tarifaComision; // Porcentaje de comisión
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String nss, String fechaNac, double venta, double tarifa){
		super(primerNombre, apellidoPaterno, nss, fechaNac);
		establecerVentasBrutas(venta);
		establecerTarifaComision(tarifa);
	}
	
	public void establecerTarifaComision(double comision){
		if (comision >= 0.0)
			tarifaComision = comision;
		else
			throw new IllegalArgumentException("La tarifa de comisión debe ser >= 0.0");
	}	
	
	public void establecerVentasBrutas(double venta){
		if (venta >= 0.0)
			tarifaComision = venta;
		else
			throw new IllegalArgumentException("La venta bruta debe ser >= 0.0");
	}
	
	public double obtenerVentasBrutas(){
		return ventasBrutas;
	}
	
	public double obtenerTarifaComision(){
		return tarifaComision;
	}
	
	public double obtenerMontoPago() {
		return obtenerTarifaComision() * obtenerVentasBrutas();
	}
	
	@Override
	public String toString() {
		return "--> Empleado por comisión:\n" + super.toString() + "\nVentas brutas: " + obtenerVentasBrutas() + "\nTarifa por comision:" + obtenerTarifaComision();
	}
	
}
