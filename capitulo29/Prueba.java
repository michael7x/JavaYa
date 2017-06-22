package capitulo29;

public class Prueba {
	
	public static void main(String[] arg){
	
		Suma suma1 = new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.println("El resultado de la suma es: ");
		suma1.mostrarResultado();
		
		Resta resta1 = new Resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.println("El resultado de la resta es: ");
		resta1.mostrarResultado();
		
		Persona juan = new Persona();
		juan.cargarDatos();
		juan.imprimirDatos();
		
		Empleado jose = new Empleado();
		jose.cargarDatos();
		jose.cargarSueldo();
		jose.imprimirDatos();
		jose.imprimirSueldo();
	}

}
