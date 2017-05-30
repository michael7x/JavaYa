/*Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar sus componentes y luego imprimirlas.*/

package capitulo22;

import java.util.Scanner;

public class Matriz1 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		mat = new int[3][5];
		for(int i=0; i<3;i++){
			for(int f = 0; f <5; f++){
				System.out.println("Ingrese componentes: ");
				mat[i][f] = teclado.nextInt();
			}
		}
	}

	public void imprimir(){
		for(int i = 0; i < 3; i++){
			for(int f = 0; f<5; f++){
				System.out.print(mat[i][f] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] arg){
		Matriz1 pruebamatriz = new Matriz1();
		pruebamatriz.cargar();
		pruebamatriz.imprimir();
	}
	
}
