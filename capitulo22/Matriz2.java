/*Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.*/

package capitulo22;

import java.util.Scanner;

public class Matriz2 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		mat = new int[4][4];
		for(int i = 0;i < 4; i++){
			for (int f = 0; f < 4; f++){
				System.out.print("Por favor ingrese valor: ");
				mat[i][f]=teclado.nextInt();
			}
		}
	}

	public void imprimir(){
		for(int i = 0; i < 4; i++){
			for(int f = 0; f < 4; f++){
				System.out.print(mat[i][f] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] arg){
		Matriz2 pruebados = new Matriz2();
		pruebados.cargar();
		pruebados.imprimir();
	}
}
