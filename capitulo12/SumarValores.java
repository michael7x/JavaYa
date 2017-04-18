/*
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero. 
 * */

package capitulo12;

import java.util.Scanner;

public class SumarValores {
	
	public static void main(String[] arg){
		
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int numero = 0;
		
		do{
			System.out.print("Por favor ingrese un número. Si es 9999 el programa finalizará. ");
			numero = teclado.nextInt();
			
			if(numero != 9999){
				suma += numero;						
			}
			
		} while	(numero != 9999);
		
		System.out.println("La suma de todos los números ingresados es igual a: " + suma);
		
		if(suma > 0){
			System.out.println("La suma es mayor que cero");
		} else {
			if (suma < 0){
				System.out.println("La suma es menor que cero");
			} else {
				System.out.println("La suma es cero");
			}
		}
	}

}
