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
		establecerPrecioPorArticulo(precio); // Valida y almacena el precio por artículo.
	}
	
	// Establece el número de pieza:
	public void establecerNumeroPieza(String pieza){
		numeroPieza = pieza; // Debería validar.
	}
	
	// Obtiene el número de piezas:
	public String obtenerNumeroPieza(){
		return numeroPieza;
	}
	
	// Establece la descripcion:
	public void establecerDescripcionPieza(String descripcion){
		descripcionPieza = descripcion; // Debería validar.
	}
	
	// Obtiene la descripción:
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
			throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
	}

	public double obtenerPrecioPorArticulo(){
		return precioPorArticulo;
	}
	
	@Override
	public String toString(){
		return
				"Factura" + "\nnúmero de pieza: " + obtenerNumeroPieza() +
				 "\ndescripción: " + obtenerDescripcionPieza() + 
				 "\ncantidad: " + obtenerCantidad() + "\nprecio por artículo: " + 
				 obtenerPrecioPorArticulo();
 	}
	
	@Override
	public double obtenerMontoPago(){
		return obtenerCantidad() * obtenerPrecioPorArticulo(); // Calcula el costro total.
	}

}
