/*Implementar la clase operaciones. 
 * Se deben cargar dos valores enteros en el constructor, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados. */

package capitulo26;

import java.util.Scanner;

public class Operaciones {
	private Scanner teclado;
	private float valor1, valor2;
	
	public Operaciones(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese el primer valor: ");
		valor1 = teclado.nextFloat();
		System.out.print("Por favor ingrese el segundo valor: ");
		valor2 = teclado.nextFloat();
	}

	public void Suma(){
		float resultado;
		resultado = valor1 + valor2;
		System.out.println("La suma es: " + resultado );
		}
	
	public void Resta(){
		float resultado;
		resultado = valor1 - valor2;
		System.out.println("La resta es: " + resultado );
		}
	
	public void Multiplicacion(){
		float resultado;
		resultado = valor1 * valor2;
		System.out.println("La multiplicación es: " + resultado );
		}
	
	public void division(){
		float resultado;
		resultado = valor1 / valor2;
		System.out.println("La división es: " + resultado );
		}


	public static void main(String[] arg){
		Operaciones prueba = new Operaciones();
		prueba.Suma();
		prueba.Resta();
		prueba.Multiplicacion();
		prueba.division();
	}

}
