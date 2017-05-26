/*Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.*/

package capitulo20;

import java.util.Scanner;

public class PruebaVector13 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for (int i = 0; i<sueldos.length;i++){
			System.out.print("Ingrese el sueldo: ");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void ordenar(){
		for(int i = 0; i < 4; i++ ){
			for (int f = 0; f < 4; f++){
				if(sueldos[f]>sueldos[f+1]){
					int aux;
					aux = sueldos[f];
					sueldos[f] = sueldos[f+1];
					sueldos[f+1] = aux;
				}
			}
		}
	}

	public void imprimir(){
		System.out.println("Sueldos ordenados de menor a mayor.");
		for(int i = 0 ; i < sueldos.length;i++){
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] ar){
		PruebaVector13 prueba = new PruebaVector13();
		prueba.cargar();
		prueba.ordenar();
		prueba.imprimir();
	}
	
}

