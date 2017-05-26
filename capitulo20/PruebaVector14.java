/*Definir un vector donde almacenar los nombres de 5 paises. Confeccionar el algoritmo de ordenamiento alfabético.*/

package capitulo20;

import java.util.Scanner;

public class PruebaVector14 {
	private Scanner teclado;
	private String[] paises;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		paises = new String[5];
		for(int i = 0; i < paises.length;i++){
			System.out.println("Ingrese el nombre del país: ");
			paises[i] = teclado.next();
		}
	}
	
	public void ordenar(){
		for(int i = 0; i < 4 ; i++){
			for(int k = 0; i< 4 - k;k++){
				if(paises[k].compareTo(paises[k+1])>0){
					String aux;
					aux = paises[k];
					paises[k] = paises[k+1];
					paises[k+1] = aux;					
				}
			}
		}
	}	

	public void imprimir(){
		System.out.println("Paises ordenado en forma alfabética: ");
		for(int i =0; i<paises.length;i++){
			System.out.println(paises[i]);
		}
	}

	public static void main(String[] arg){
		PruebaVector14 prueba = new PruebaVector14();
		prueba.cargar();
		prueba.ordenar();
		prueba.imprimir();
	}
}
