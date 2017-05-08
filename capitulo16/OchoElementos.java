/*
Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50. 
*/

package capitulo16;

import java.util.Scanner;

public class OchoElementos {
	private Scanner teclado;
	private int[] ochonumeros;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		ochonumeros = new int[8];
		
		for(int i = 0; i<8; i++){
			System.out.print("Ingrese el valor: ");
			ochonumeros[i] = teclado.nextInt();
		}
	}
	
	public void sumaTotal(){
		float suma;
		suma = 0;
		
		for(int i = 0; i<8;i++){
			suma = suma+ochonumeros[i];
		}
		System.out.println("El valor de la suma es: " + suma);
	}
	
	public void sumaMayorTreinteSeis(){
		float suma;
		suma = 0;
		for(int i = 0; i<8;i++){
			if(ochonumeros[i]> 36){
				suma = suma + ochonumeros[i];
			}
		}
		System.out.println("El valor de la suma de numeros mayores a 36 es: " + suma);
	}
	
	public void mayorACincuenta(){

		
		int contadorMayorDeCincuenta;
		contadorMayorDeCincuenta = 0;
		
		for(int i = 0; i<8;i++){
			if(ochonumeros[i] > 50){
				contadorMayorDeCincuenta++;
			}
		}
		System.out.println("La cantidad de números mayores de 50 son: " + contadorMayorDeCincuenta);
	}
	

	public static void main(String[] arg){
		OchoElementos prueba = new OchoElementos();
		prueba.cargar();
		prueba.sumaTotal();
		prueba.sumaMayorTreinteSeis();
		prueba.mayorACincuenta();
	}
	
}
