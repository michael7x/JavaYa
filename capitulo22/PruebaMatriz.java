/*Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por columna (es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
Imprimir luego la matriz.*/

package capitulo22;

import java.util.Scanner;

public class PruebaMatriz {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		matriz = new int[2][5];
		
		for(int i = 0; i < 5;i++){
			for(int f = 0; f < 2; f++){
				System.out.print("Ingrese compomente: ");
				matriz[f][i] = teclado.nextInt();
			}
		}
	}

	public void imprimir(){
		for(int i = 0; i < 2; i++){
			for(int f = 0; f< 5; f++){
				System.out.print(matriz[i][f] + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] arg){
		PurebaMatriz pruebaejercicio = new PurebaMatriz();
		pruebaejercicio.cargar();
		pruebaejercicio.imprimir();
	}
}

