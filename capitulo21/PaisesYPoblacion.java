/*
 Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo. 
 Ordenar alfabéticamente e imprimir los resultados. 
 Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
 */

package capitulo21;

import java.util.Scanner;

public class PaisesYPoblacion {
	private Scanner teclado;
	private String[] paises;
	private int[] poblacion;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		paises = new String[5];
		poblacion = new int[5];
		
		System.out.println("Ahora ingresará país y población");
		for(int i = 0; i < paises.length; i++){
			System.out.print("Ingrese país: ");
			paises[i] = teclado.next();
			System.out.print("Ingrese población: ");
			poblacion[i] = teclado.nextInt();
			
		}
	}
	
	public void ordenar(){
		for(int i = 0; i< paises.length; i++){
			for(int f = 0; f<(paises.length-1-i);f++){
				if(paises[f].compareTo(paises[f+1])>0){
					String auxpais;
					auxpais = paises[f];
					paises[f] = paises[f+1];
					paises[f+1] = auxpais;
					int auxpoblacion;
					auxpoblacion = poblacion[f];
					poblacion[f] = poblacion[f+1];
					poblacion[f+1] = auxpoblacion;
				}
			}				
		}
	}

	public void imprimir(){
		System.out.println("Los países ordenados de manera alfabética: ");
		for(int i = 0; i<paises.length;i++){
			System.out.println("País: " + paises[i] + " Población: " + poblacion[i]);
		}
	}

	public static void main(String[] arg){
		
		PaisesYPoblacion pruebapaises = new PaisesYPoblacion();
		pruebapaises.cargar();
		pruebapaises.ordenar();
		pruebapaises.imprimir();
		
	}

}
