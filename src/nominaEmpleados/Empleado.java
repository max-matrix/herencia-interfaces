package nominaEmpleados;

// Porque el método de ingresos es abstracto, esa responsabilidad la realiza cada una de las clases hijas.
// Caja clase hija lo resuelve a su forma por polimorfismo.
public abstract class Empleado implements PorPagar { // Si luego pongo más especificaciones de empleados, hereda PorPagar también.
	
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial; // CAMBIAR POR STRING!!!!!
	private String fechaNac;
	
	public Empleado(String primerNombre, String apellidoPaterno, String nss, String fechaNac) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		numeroSeguroSocial = nss;
		this.fechaNac = fechaNac;
	}
	
	public void establecerPrimerNombre(String nombre){
		primerNombre = nombre;
	}
	
	public void establecerApellidoPaterno(String apellido){
		apellidoPaterno = apellido;
	}
	
	public void establecerNumeroSeguroSocial (String nss){
		numeroSeguroSocial = nss;
	}
	
	public void establecerFechaNacimiento (String nac){
		fechaNac = nac;
	}
	
	public String obtenerPrimerNombre(){
		return primerNombre;
	}
	
	public String obtenerApellidoPaterno(){
		return apellidoPaterno;
	}
	
	public String obtenerNumeroSeguroSocial(){
		return numeroSeguroSocial;
	}
	
	public String obtenerFechaNacimiento(){
		return fechaNac;
	}
	
	// public abstract double ingresos();

	@Override
	public String toString() {
		return "Nombre:" + obtenerPrimerNombre() + "\nApellido: " + obtenerApellidoPaterno()
				+ "\nNSS: " + obtenerNumeroSeguroSocial() + "\nFechaNacimiento: " + obtenerFechaNacimiento();
	}

}
