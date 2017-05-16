package capitulo18;

import java.util.Scanner;

public class PruebaVector10 {
	private Scanner teclado;
	private String[] nombres;
	private int[] edades;
	
	public void cargar(){
		teclado = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];
		
		for(int i = 0; i <nombres.length;i++){
			System.out.print("Ingrese el nombre: ");
			nombres[i] = teclado.next();
			System.out.print("Ingrese edad: ");
			edades[i] = teclado.nextInt();
		}
	}
	
	public void mayoresEdad(){
		System.out.println("Personas mayores de edad.");
		
		for(int i = 0; i<nombres.length; i++){
			if(edades[i]>=18){
				System.out.println(nombres[i]);
			}
		}
	}

	public static void main(String[] arg){
		PruebaVector10 pv = new PruebaVector10();
		pv.cargar();
		pv.mayoresEdad();
	}
	
}
