// Ejemplo
/*
*Desarrollar una clase que represente un Cuadrado y tenga los siguientes métodos: cargar el valor de su lado, imprimir su perímetro y su superficie.
*/
// link https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=14&codigo=87&inicio=0

package capitulo14;

import java.util.Scanner;

public class Cuadrado {
	private Scanner teclado;
	int lado;
	
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor del lado: ");
		lado = teclado.nextInt();
	}
	
	public void imprimirPerimetro(){
		int perimetro;
		perimetro = lado * 4;
		System.out.println("El perimetro es: " + perimetro);
	}

	public void imprimirSuperficie(){
		int superficie;
		superficie = lado * lado;
		System.out.println("La superficie es: " + superficie);
	}
	
	public static void main(String[] arg){
		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.imprimirPerimetro();
		cuadrado1.imprimirSuperficie();
	}
	
}
