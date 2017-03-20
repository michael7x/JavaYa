// Ejemplo
// Confeccionar una clase que permita carga el nombre y la edad de una persona. Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0

package capitulo14;
import java.util.Scanner;

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese su nombre: ");
		nombre = teclado.next();
		System.out.print("Por favor ingres su edad: ");
		edad = teclado.nextInt();
	}
	
	public void imprimir(){
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
	}
	
	public void esMayorEdad(){
		if(edad >= 18){
			System.out.println(nombre + " es mayor de edad. ");
		} else{
			System.out.println(nombre + " no es mayor de edad. ");
		}
	}
	
	public static void main(String[] ar){
		Persona persona1;
		persona1 = new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.esMayorEdad();
	}

}
