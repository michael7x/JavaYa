package capitulo23;

import java.util.Scanner;

public class Matriz5 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese las filas de la matriz");
		int filas = teclado.nextInt();
		System.out.println("Por favor ingrese las columnas de la matriz");
		int columnas = teclado.nextInt();
		mat = new int[filas][columnas];
		for(int i = 0; i<mat.length;i++){
			for(int c = 0; c < mat[i].length; c++){
				System.out.println("Ingrese componente: ");
				mat[i][c] = teclado.nextInt();
			}
		}

	}

	public void imprimir(){
		for(int i= 0; i < mat.length;i++){
			for(int c = 0; c < mat[i].length;c++){
				System.out.print(mat[i][c]+" ");
			}
			System.out.println();
		}		
	}

	public void imprimirUltimaFila(){
		System.out.println("Ultima fila");
		for(int c = 0; c <mat[mat.length-1].length;c++){
			System.out.println(mat[mat.length - 1][c]+" ");
		}
	}
	
	public static void main(String[] arg){
		Matriz5 prueba = new Matriz5();
		prueba.cargar();
		prueba.imprimir();
		prueba.imprimirUltimaFila();
	}
}
