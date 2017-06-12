/*
 Confeccionaremos un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa.  
 */

package capitulo25;

import java.util.Scanner;

public class MatrizIrregular1 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.print("Cuantas filas tiene la matriz: ");
		int filas = teclado.nextInt();
		mat = new int[filas][];
		
		for(int f = 0; f <mat.length;f++){
			System.out.print("Elementos de la fila " + f + ": ");
			int elementos=teclado.nextInt();
			mat[f]=new int[elementos];
			
			for(int c = 0; c < mat[f].length;c++){
				System.out.print("Ingrese componente: ");
				mat[f][c]=teclado.nextInt();
			}
		}
	}

	public void imprimir(){
		for(int f = 0; f<mat.length;f++){
			for(int c = 0; c<mat[f].length;c++){
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] arg){
		MatrizIrregular1 prueba = new MatrizIrregular1();
		prueba.cargar();
		prueba.imprimir();
	}
	
}
