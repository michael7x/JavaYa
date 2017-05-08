//Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.

package capitulo16;

import java.util.Scanner;

public class DiezVectoresMayores {
	private Scanner teclado;
	private int[] vectoresIngresados;

	public void cargar(){
		teclado = new Scanner(System.in);
		vectoresIngresados = new int[10];
		
		System.out.println("Por favor ingrese 10 valores");
		for(int i = 0; i<10; i++){
			System.out.print("Ingrese valor: ");
			vectoresIngresados[i] = teclado.nextInt();
		}
	}
	
	public void verificarOrdenado(){
		int orden = 0;
		
		for(int i = 0; i < (vectoresIngresados.length - 1); i++){
			if(vectoresIngresados[i+1] < vectoresIngresados[i]){
				orden = 1;
			}
		}
		
		if (orden == 1){
			System.out.println("Los vectores no están ordenados de menor a mayor");
		} else {
			System.out.println("Los vectores están ordenados de menor a mayor");
		}
	}
	
	public static void main(String[] args){
		DiezVectoresMayores prueba = new DiezVectoresMayores();
		prueba.cargar();
		prueba.verificarOrdenado();
		
	}
}
