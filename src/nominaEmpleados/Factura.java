package nominaEmpleados;

public class Factura implements PorPagar {
	
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	// Constructor con cuatro argumetnos:
	public Factura (String pieza, String descripcion, int cuenta, double precio){
		numeroPieza = pieza;
		descripcionPieza = descripcion;
		establecerCantidad(cuenta); // Valida y almacena la cantidad.
		establecerPrecioPorArticulo(precio); // Valida y almacena el precio por art�culo.
	}
	
	// Establece el n�mero de pieza:
	public void establecerNumeroPieza(String pieza){
		numeroPieza = pieza; // Deber�a validar.
	}
	
	// Obtiene el n�mero de piezas:
	public String obtenerNumeroPieza(){
		return numeroPieza;
	}
	
	// Establece la descripcion:
	public void establecerDescripcionPieza(String descripcion){
		descripcionPieza = descripcion; // Deber�a validar.
	}
	
	// Obtiene la descripci�n:
	public String obtenerDescripcionPieza(){
		return descripcionPieza;
	}
	
	public void establecerCantidad (int cuenta){
		if (cuenta >= 0) 
			cantidad = cuenta;
		else
			throw new IllegalArgumentException("La cantidad debe ser >= 0");
	}
	
	public int obtenerCantidad(){
		return cantidad;
	}
	
	public void establecerPrecioPorArticulo(double precio){
		if (precio >= 0.0)
			precioPorArticulo = precio;
		else
			throw new IllegalArgumentException("El precio por art�culo debe ser >= 0");
	}

	public double obtenerPrecioPorArticulo(){
		return precioPorArticulo;
	}
	
	@Override
	public String toString(){
		return
				"Factura" + "\nn�mero de pieza: " + obtenerNumeroPieza() +
				 "\ndescripci�n: " + obtenerDescripcionPieza() + 
				 "\ncantidad: " + obtenerCantidad() + "\nprecio por art�culo: " + 
				 obtenerPrecioPorArticulo();
 	}
	
	@Override
	public double obtenerMontoPago(){
		return obtenerCantidad() * obtenerPrecioPorArticulo(); // Calcula el costro total.
	}

}
