/*
 * Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar. Luego crear un vector con dicho tamaño.
 * */

package capitulo17;

import java.util.Scanner;

public class PruebaVector8 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.println("Cuantos sueldos cargará: ");
		int cant;
		cant = teclado.nextInt();
		sueldos = new int[cant];
		
		for(int i = 0; i < cant;i++){
			System.out.println("Ingrese sueldo: ");
			sueldos[i] = teclado.nextInt();
		}
	}

	public void imprimir(){
		for(int i = 0; i < sueldos.length; i++){
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] arg){
		PruebaVector8 pv = new PruebaVector8();
		pv.cargar();
		pv.imprimir();
	}
}
