// Ejercicio 1
/*
*Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.
*Confeccionar los métodos para la carga, otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000) 
*/
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0


package capitulo14;
import java.util.Scanner;

public class Operario {
	private String nombre;
	private float sueldo;
	
	public void inicializar(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese el nombre del empleado: ");
		nombre = teclado.next();
		System.out.print("Por favor ingrese el sueldo del empleado: ");
		sueldo = teclado.nextInt();
		
	};
		
	public void imprimirDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo: " + sueldo);
	}
	
	public void pagaImpuestos(){
		if(sueldo > 3000){
			System.out.println("Usted debe pagar impuestos");
		} else {
			System.out.println("Usted no debe pagar impuestos");
		}
	}

	public static void main(String[] ar){
		Operario empleado1;
		empleado1 = new Operario();
		empleado1.inicializar();
		empleado1.imprimirDatos();
		empleado1.pagaImpuestos();
	}

}
