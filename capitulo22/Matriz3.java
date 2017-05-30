/*Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila. Imprimir la última fila e imprimir la primer columna.*/

package capitulo22;

import java.util.Scanner;

public class Matriz3 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		mat = new int[3][4];
		for(int i = 0; i < 3; i++){
			for(int f = 0; f < 4; f++){
				System.out.print("Por favor ingrese componente: ");
				mat[i][f] = teclado.nextInt();
			}
		}
	}

	public void primerFila(){
		System.out.println("Primer fila de la matriz: ");
		for(int i = 0; i < 4; i++){
			System.out.println(mat[0][i]);
		}
	}
	
	public void ultimaFila(){
		System.out.println("Ultima fila de la matriz: ");
		for(int i = 0; i < 4; i++){
			System.out.println(mat[2][i]);
		}
	}
	
	public void primerColumna(){
		System.out.println("Primer columna: ");
		for(int i = 0; i < 3; i++){
			System.out.println(mat[i][0]);
		}
	}

	public static void main(String[] ar){
		Matriz3 pruebatres = new Matriz3();
		pruebatres.cargar();
		pruebatres.primerFila();
		pruebatres.ultimaFila();
		pruebatres.primerColumna();
		
	}
	
}
