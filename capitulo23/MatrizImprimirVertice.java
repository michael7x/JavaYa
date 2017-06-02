package capitulo23;

import java.util.Scanner;

public class MatrizImprimirVertice {
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese numero de filas: ");
		int filas = teclado.nextInt();
		System.out.print("Por favor ingrese numero de columnas: ");
		int columnas = teclado.nextInt();
		
		matriz = new int[filas][columnas];
		
		for(int f = 0; f<matriz.length;f++){
			for(int c = 0; c<matriz[f].length;c++){
				System.out.print("Por favor ingrese valor: ");
				matriz[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimirVertice(){
		System.out.print("Superior Izquierdo: ");
		System.out.println(matriz[0][0]);
		System.out.print("Superior Derecho: ");
		System.out.println(matriz[0][matriz[0].length-1]);
		System.out.print("Inferior Izquierdo: ");
		System.out.println(matriz[matriz.length-1][0]);
		System.out.print("Inferior Derecho: ");
		System.out.println(matriz[matriz.length-1] [matriz[matriz.length-1].length-1]);
	}

	public void imprimir(){
		for(int f = 0; f<matriz.length;f++){
			for(int c = 0; c<matriz[f].length;c++){
				System.out.print(matriz[f][c]+ " ");
			}
			System.out.println();
		}		
	}

	public static void main(String[] arg){
		MatrizImprimirVertice pruebavertice = new MatrizImprimirVertice();
		pruebavertice.cargar();
		pruebavertice.imprimir();		
		pruebavertice.imprimirVertice();
	}

}
