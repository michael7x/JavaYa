/*
 Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo. 
 En el constructor cargar los atributos y luego en otro método imprimir sus datos.
 Por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000).
 */

package capitulo26;

import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	private String nombre;
	private int sueldo;

	public Empleado(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
		nombre = teclado.next();

		System.out.print("Ingrese el sueldo: ");
		sueldo = teclado.nextInt();
	}

	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo: " + sueldo);
	}

	public void esMayor(){
		if(sueldo > 3000){
			System.out.println("Debe pagar impuestos");
		} else {
			System.out.println("No debe pagar impuestos");
		}
		
	}


	public static void main(String[] arg){
		Empleado prueba = new Empleado();
		prueba.imprimir();
		prueba.esMayor();
		
	}

}
