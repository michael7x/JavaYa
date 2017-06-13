package capitulo26;

import java.util.Scanner;

public class Alumno {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumno(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}

	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}


	public void esMayor(){
		if (edad > 18){
			System.out.println("Es mayor");
		} else {
			System.out.println("Es menor");
		}
	}
	
	public static void main(String[] arg){
		Alumno prueba = new Alumno();
		prueba.imprimir();
		prueba.esMayor();
	}
	
}
