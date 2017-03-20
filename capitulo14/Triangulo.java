// Ejemplo
/*
*Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos:
*inicializar los atributos, imprimir el valor del lado mayor y otro método que muestre si es equilátero o no.
*/
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0

package capitulo14;

import java.util.Scanner;

public class Triangulo {
	private Scanner teclado;
	private int lado1, lado2, lado3;
	
	public void inicializar(){
		teclado = new  Scanner(System.in);
		System.out.print("Medida lado 1: ");
		lado1 = teclado.nextInt();
		System.out.print("Medida lado 2: ");
		lado2 = teclado.nextInt();
		System.out.print("Medida lado 3: ");
		lado3 = teclado.nextInt();
	}
	
	public void ladoMayor(){
		if(lado1 > lado2 && lado1 > lado3){
			System.out.println(lado1);
		} else {
			if(lado2 > lado3){
				System.out.println(lado2);
			} else {
				System.out.println(lado3);				
			}
		}
	}

	public void esEquilatero(){
		if(lado1 == lado2 && lado1==lado3){
			System.out.println("Es un triángulo equilatero");
		} else {
			System.out.println("No es un triángulo equilatero");
		}
	}

	public static void main(String[] arg){
		Triangulo triangulo1 = new Triangulo();
		triangulo1.inicializar();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();
	}
}
