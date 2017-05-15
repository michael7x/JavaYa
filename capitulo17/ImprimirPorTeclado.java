/*Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos */

package capitulo17;

import java.util.Scanner;

public class ImprimirPorTeclado {
	private Scanner teclado;
	private int[] numeros;
	
	public void cargar()
	{
		teclado = new Scanner(System.in);
		System.out.print("¿Cuántos números cargará? ");
		int cant;
		cant = teclado.nextInt();
		numeros = new int[cant];
		
		for(int i=0; i< numeros.length;i++){
			System.out.println("Ingrese el número: ");
			numeros[i] = teclado.nextInt();
		}
	}
	
	public void imprimir(){
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
	}
	
	public static void main(String[] arg){
		ImprimirPorTeclado prueba = new ImprimirPorTeclado();
		prueba.cargar();
		prueba.imprimir();
	}
	
	
}
