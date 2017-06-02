/*Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segunda. Imprimir luego la matriz*/

package capitulo23;

import java.util.Scanner;

public class MatrizMxN {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese filas: ");
		int filas = teclado.nextInt();
		System.out.print("Por favor ingrese columnas: ");
		int columnas = teclado.nextInt();
		matriz = new int[filas][columnas];
		
		for(int f = 0; f < matriz.length; f++){
			for(int c = 0; c<matriz[f].length;c++){
				System.out.print("Ingrese componente: ");
				matriz[f][c] = teclado.nextInt();
			}
		}
		
	}

	public void intercambiar(){
		for(int c = 0; c<matriz[0].length;c++){
			int aux = matriz[0][c];
			matriz[0][c] = matriz[1][c];
			matriz[1][c] = aux;
		}		
	}
	
	public void imprimir(){
		for(int f = 0; f<matriz.length;f++){
			for(int c = 0; c < matriz[f].length;c++){
				System.out.print(matriz[f][c]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] arg){
		MatrizMxN pruebamatriz = new MatrizMxN();
		pruebamatriz.cargar();
		System.out.println("El original:");
		pruebamatriz.imprimir();
		pruebamatriz.intercambiar();
		System.out.println("Intercambiado:");
		pruebamatriz.imprimir();
	}

	
	
}
