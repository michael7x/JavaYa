Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. 
 Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. 
 Sumar componente a componente
 * */

package capitulo16;

import java.util.Scanner;

public class TresVectores {
	private Scanner teclado;
	private int[] vectorUno;
	private int[] vectorDos;
	private int[] vectorResultado;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		vectorUno = new int[4];
		vectorDos = new int[4];
		
		System.out.println("Ingrese los valores para el vector 1: ");
		for(int i = 0; i<4; i++){
			System.out.print("Ingrese valor: ");
			vectorUno[i] = teclado.nextInt();
		}
		
		System.out.println("Ingrese los valores para el vector 2");
		for(int i = 0; i<4; i++){
			System.out.print("Ingrese valor: ");
			vectorDos[i] = teclado.nextInt();
		}
	}
			
	public void sumaVectores(){
		vectorResultado = new int[4];
		
		for(int i = 0; i<4;i++){
			vectorResultado[i] = vectorUno[i] + vectorDos[i];
		}
		
		System.out.println("El vector suma resultante es igual a: ");
		for(int i = 0; i<4;i++){
			System.out.println("Con el índice " + i + " La suma es igual a: " + vectorResultado[i]);
		}
		
	}
	
	public static void main(String[] arg){
		TresVectores pruebavectores = new TresVectores();
		pruebavectores.cargar();
		pruebavectores.sumaVectores();
	}
}
