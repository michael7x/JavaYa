/*Desarrollar un programa que solicite la carga de una clave. 
 *La clase debe tener dos métodos uno para la carga y otro que muestre si la clave es la correcta (la clave a comparar es "123abc") */

package capitulo27;

import java.util.Scanner;

public class CompararClave {
	private Scanner teclado;
	String clave;
	
	public void cargarClave(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese clave: ");
		clave = teclado.next();
	}

	public void comparar(){
		int comparacion = clave.compareTo("123abc");
		if(comparacion == 0 ){
			System.out.println("La clave es correcta");
		} else {
			System.out.println("La clave es incorrecta");
		}
	}


	public static void main(String[] arg){
		CompararClave prueba = new CompararClave();
		prueba.cargarClave();
		prueba.comparar();
	}
}
