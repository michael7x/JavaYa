/*Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector*/

package capitulo20;

import java.util.Scanner;

public class CargarVector {
	private Scanner teclado;
	private int[] numeros;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		int cantidadACargar;
		System.out.print("Ingrese la cantidad de valores a cargar: ");
		cantidadACargar = teclado.nextInt();
		numeros = new int[cantidadACargar];
		
		for(int i = 0; i < cantidadACargar; i++){
			System.out.print("Por favor ingrese un número: ");
			numeros[i] = teclado.nextInt();
		}
	}

	public void ordenar(){
		for(int i = 0; i < numeros.length; i++){
			for(int k = 0; k < numeros.length - 1 - i; k++){
				if(numeros[k] > numeros[k+1]){
					int aux;
					aux = numeros[k];
					numeros[k] = numeros[k+1];
					numeros[k+1] = aux;
				}
			}
		}
	}

	public void imprimir(){
		System.out.println("Numeros ordenados de menor a mayor.");
		for(int i = 0; i < numeros.length;i++){
			System.out.println(numeros[i]);
		}
	}

	public static void main(String[] ar){
		CargarVector prueba = new CargarVector();
		prueba.cargar();
		prueba.ordenar();
		prueba.imprimir();
	}
}
