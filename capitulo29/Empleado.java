package capitulo29;

public class Empleado extends Persona{
	protected float sueldo;
	
	public void cargarSueldo(){
		System.out.print("Ingrese el sueldo del empleado: ");
		sueldo = teclado.nextInt();
	}
	
	public void imprimirSueldo(){
		System.out.print("El sueldo es: " + sueldo);
	}
	

}
