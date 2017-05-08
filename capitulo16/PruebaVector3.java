/*
Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde)
Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados por turno.
Imprimir los gastos en sueldos de cada turno.
*/

package capitulo16;

import java.util.Scanner;

public class PruebaVector3 {
	private Scanner teclado;
	private float[] turnoMan;
	private float[] turnoTar;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		turnoMan = new float[4];
		turnoTar = new float[4];
		System.out.println("Sueldos de empleados del turno de la mañana.");
		for(int f = 0; f<4;f++){
			System.out.print("Ingrese su sueldo:");
			turnoMan[f] = teclado.nextFloat();
		}
		System.out.println("Sueldos de empleados del turno de la tarde.");
		for(int f=0; f<4;f++){
			System.out.print("Ingrese sueldo:");
			turnoTar[f]=teclado.nextFloat();
		}
	}
	
	public void calcularGastos(){
		float man = 0;
		float tar = 0;
		for(int f=0; f<4;f++){
			man = man + turnoMan[f];
			tar = tar + turnoTar[f];
		}
		System.out.println("Total de gastos del turno de la mañana: "+ man);
		System.out.println("Total de gastos del turno de la tarde: " + tar);
	}
	
	public static void main(String[] ar){
		PruebaVector3 pv = new PruebaVector3();
		pv.cargar();
		pv.calcularGastos();
	}
	
	
}
