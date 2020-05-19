package nominaEmpleados;

public class PruebaInterfazPorPagar {

	public static void main(String[] args) {
		
		// Crea arreglo PorPagar con cuatro elementos:
		PorPagar[] objetosPorPagar = new PorPagar [4];
		
		// Llena el arreglo con objetos que implementan la interfaz PorPagar:
		objetosPorPagar[0] = new Factura ("01234", "asiento", 2, 375.00);
		objetosPorPagar[1] = new Factura ("56789", "llanta", 4, 79.95);
		objetosPorPagar[2] = new EmpleadoAsalariado ("John", "Smith", "111-11-1111", "1970/12/20", 800.00);
		objetosPorPagar[3] = new EmpleadoAsalariado ("Lisa", "Barnes", "888-88-8888", "1985/01/23", 1200.00);
		/* COMPLETAR!!
		objetosPorPagar[4] = new EmpleadoBaseMasComision ();
		objetosPorPagar[5] = new EmpleadoPorComision ();
		objetosPorPagar[6] = new EmpleadoPorHoras ();
		objetosPorPagar[7] = new EmpleadoPorPiezas();
		*/
		
		System.out.println("Facturas y Empleados procesados en forma polimórfica:\n");
		
		// Procesa en forma genérica cada elemento en el arreglo objetosPorPagar:
		// Proceso desde la jerarquización más abstracta. En Herencia-Polimorfismo era la clase Empleado,
		// en este caso es la interfaz PorPagar.
		for (PorPagar porPagarActual : objetosPorPagar){
			System.out.println(porPagarActual.toString() + "\nPago vencido: " + porPagarActual.obtenerMontoPago() +"\n");
		}

	}

}
