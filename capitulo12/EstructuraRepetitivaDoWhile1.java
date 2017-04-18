/*
 * Este bloque se repite hasta que se ingresa en la variable valor el número 0
 * con lo que la condición de la estructura do while retorna falso y sale del bloque repetitivo finalizando el programa.
 * 
 * https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=12&codigo=85&inicio=0
*/
package capitulo12;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile1 {
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print("Ingrese un valor entre 0 y 999. Con 0 finaliza: ");
			valor = teclado.nextInt();
			if (valor >= 100){
				System.out.println("Tiene 3 digitos.");
			} else {
				if (valor >= 10 ){
					System.out.println("Tiene dos digitos");
				} else {
					System.out.println("Tiene un digito.");
				}
			}
		} while (valor != 0);
	}
}
