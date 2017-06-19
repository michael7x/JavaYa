package capitulo28;

import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	
	
	public Socio(Scanner teclado){
		teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese el nombre: ");
		nombre = teclado.next();
		System.out.print("Por favor ingrese la antiguedad: ");
		antiguedad = teclado.nextInt();
	}
	
	public void imprimir(){
		System.out.println(nombre + " tiene una antiguedad de " + antiguedad);
	}
	
	public int retornarAntiguedad(){
		return antiguedad;
	}
	
	
}
