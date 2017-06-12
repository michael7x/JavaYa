/*
Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han faltado cada empleado (cargar el número de día que faltó)
Cada fila de la matriz representan los días de cada empleado.
Mostrar los empleados con la cantidad de inasistencias.
Cuál empleado faltó menos días.  
 */

package capitulo25;

import java.util.Scanner;

public class AusenciaTresEmpleados {
	private Scanner teclado;
	private String[] empleados;
	private int[][] dias;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		empleados = new String[3];
		dias = new int[3][];
		
		for(int f = 0; f < empleados.length; f++){
			System.out.print("Ingrese el nombre del empleado: ");
			empleados[f] = teclado.next();
			
			System.out.print("Cuántos días faltó el empleado: ");
			int faltas = teclado.nextInt();
			dias[f] = new int[faltas];
			
			for(int c = 0; c < dias[f].length;c++){
				System.out.print("Ingrese nro de días: ");
				dias[f][c] = teclado.nextInt();
			}
		}
	}

	public void imprimirInasistencias(){
		for(int f = 0; f < empleados.length; f++){
			System.out.println(empleados[f] + " faltó " + dias[f].length + " días");
		}
	}
	
	public void menorFalta(){
		int faltas = dias[0].length;
		String nom = empleados[0];
		
		for(int f = 0; f < dias.length; f++){
			if(dias[f].length < faltas){
				faltas = dias[f].length;
				nom = empleados[f];
			}			
		}
		System.out.println("El empleado que faltó menos es " +nom+ " con " + faltas + " faltas.");
	}

	public static void main(String[] arg){
		AusenciaTresEmpleados prueba = new AusenciaTresEmpleados();
		prueba.cargar();
		prueba.imprimirInasistencias();
		prueba.menorFalta();
	}

}
