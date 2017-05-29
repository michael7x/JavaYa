/*
Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas.
Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.
 */

package capitulo21;

import java.util.Scanner;

public class PurebaVector16 {
	private Scanner teclado;
	private String[] nombres;
	private int[] notas;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		nombres = new String[5];
		notas = new int[5];
		
		System.out.println("Por favor cargue los nombres y las notas");
		for(int i = 0; i <nombres.length;i++){
			System.out.println("Ingrese nombre: ");
			nombres[i] = teclado.next();
			System.out.println("Por favor ingrese nota: ");
			notas[i] = teclado.nextInt();
		}
	}

	public void ordenar(){
		for(int i = 0; i < notas.length;i++){
			for(int f = 0; f < (notas.length-1-i);f++){
				if(notas[f] < notas[f+1]){
					int auxnota;
					auxnota = notas[f];
					notas[f] = notas[f+1];
					notas[f+1] = auxnota;
					String auxnombre;
					auxnombre = nombres[f];
					nombres[f] = nombres[f+1];
					nombres[f+1] = auxnombre;
				}				
			}
		}
	}

	public void imprimir(){
		System.out.println("Nombres de alumnos y notas de mayor a menor");
		for(int f = 0; f<notas.length; f++){
			System.out.println(nombres[f] + " - " + notas[f]);
		}
	}

	public static void main(String[] ar){
		PurebaVector16 prueba = new PurebaVector16();
		prueba.cargar();
		prueba.ordenar();
		prueba.imprimir();
	}
	
}
