package nominaEmpleados;

public class PruebaSistemaNomina {

	public static void main(String[] args) {
		
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "CSS001", "2020-02-01", 800.000);
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "CSS002", "2020-02-01", 16.75, 40);
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "CSS003", "2020-02-01", 1000, 100.5);
		EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "CSS004", "2020-02-01", 10000, 12.75, 85000);
		EmpleadoPorPiezas empleadoPorPiezas = new EmpleadoPorPiezas("Steve", "Johansen", "CSS005", "2020-02-01", 159.9, 210);
		
		System.out.println("Empleados procesados por separado:\n");
		
		System.out.println(empleadoAsalariado + "ingresos" + empleadoAsalariado.obtenerMontoPago());
		System.out.println(empleadoPorHoras + "ingresos" + empleadoPorHoras.obtenerMontoPago());
		System.out.println(empleadoPorComision + "ingresos" + empleadoPorComision.obtenerMontoPago());
		System.out.println(empleadoBaseMasComision + "ingresos" + empleadoBaseMasComision.obtenerMontoPago());
		
		Empleado [] empleados = new Empleado[5];
		
		empleados[0] = empleadoAsalariado;
		empleados[1] = empleadoPorHoras;
		empleados[2] = empleadoPorComision;
		empleados[3] = empleadoBaseMasComision;
		empleados[4] = empleadoPorPiezas;
		
		System.out.println("Empleados procesados en forma polimórfica:\n");

		for (Empleado empleadoActual : empleados){
			System.out.println(empleadoActual); // Invoca a toString
			
			// determina si el elemento es un EmpleadoBaseMasComision
			// instanceof: nos permite averiguar a qué clase pertenece una determinada instancia.
			// si esa invocación no es posible y no la checkeamos anteriormente,
			// nos va a dar un error en tiempo de ejecución.
			// Se llama conversión descendente. Miramos la jerarquía desde arriba hacia abajo.
			if (empleadoActual instanceof EmpleadoBaseMasComision){
				EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
				
				empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
				
				System.out.println("El nuevo salario base con 10% de aumento es: " + empleado.obtenerSalarioBase());
			} // Fin del if.
			System.out.println("Ingresos: " + empleadoActual.obtenerMontoPago());
		}	
			
			// Obtiene el nombre del tipo de cada objeto en el arreglo de empleados:
			for (int j = 0; j < empleados.length; j++)
				System.out.printf("El emplado %d es un %s\n", j, empleados[j].getClass().getName());
		
	}
}
