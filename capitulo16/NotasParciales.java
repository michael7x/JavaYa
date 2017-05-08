/*
Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general
 */

package capitulo16;

import java.util.Scanner;

public class NotasParciales {
	Scanner teclado = new Scanner(System.in);
	private float[] turnoA;
	private float[] turnoB;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		turnoA = new float[5];
		turnoB = new float[5];
		
		System.out.println("Ingrese las notas del turno A");
		for(int i = 0; i< 5; i++){
			System.out.println("Ingrese notas: ");
			turnoA[i] = teclado.nextFloat();
		}
		
		System.out.println("Ingrese las notas del turno B");
		for(int i = 0; i< 5; i++){
			System.out.println("Ingrese notas: ");
			turnoB[i] = teclado.nextFloat();
		}
		
	}

	public void promedioGeneral(){
		float promedioGeneral = 0;
		float sumatoriaDeNotas = 0;
		
		for(int i = 0; i <= 5; i++){
			sumatoriaDeNotas = sumatoriaDeNotas + turnoA[i] + turnoB[i];
		}
		
		promedioGeneral = sumatoriaDeNotas/10;
		
		System.out.println("El promedio general es: " + promedioGeneral);
		
	}

	public void mayorPromGeneral(){
		float promA = 0;
		float promB = 0;
		
		for (int i = 0; i < 5; i++ ){
			promA = promA + turnoA[i];
			promB = promB + turnoB[i];
		}
		
		if(promA > promB ){
			System.out.println("El promedio A es mayor");
		} else {
			if(promA<promB){
				System.out.println("El promedio B es mayor");
			} else
				System.out.println("Los promedios son iguales");
		}
	}

	public static void main(String arg[]){
		NotasParciales testnotas = new NotasParciales();
		testnotas.cargar();
		testnotas.mayorPromGeneral();
	}
}
